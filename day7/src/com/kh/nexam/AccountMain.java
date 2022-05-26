package com.kh.nexam;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Account account = null;
        int money = 0;
        int i = 0;

        final int accountsLimit = 10; //개설 가능 계좌 수
        Account[] accounts = new Account[accountsLimit];
        int enrollment = 0; //등록된 계좌 수
        String accountname;
        String abolition;

        Scanner scanner = new Scanner(System.in);

        boolean stop = false; //do-while문 제어

        do {

            if (accounts[i] == null) {
                System.out.println("[메뉴] 1.계좌개설 6.계좌현황 7.종료");
            } else {
                System.out.println("[메뉴] 1.계좌개설 2.입금 3.출금 4.잔액확인 5.계좌폐지 6.계좌현황 7.종료");
            }
            System.out.print(">> ");

            String menunum = scanner.nextLine();

            switch (menunum) {
                case "1": //계좌 개설
                    for (int x = 0; x < accounts.length; x++) {
                        if (accounts[x] == null) {
                            System.out.println("계좌명을 입력하세요");
                            System.out.print(">> ");
                            String accountName = scanner.nextLine();
                            accounts[x] = new Account(accountName);
                            System.out.println(accountName + " 계좌가 개설되었습니다!");
                            enrollment++;
                            System.out.println("추가등록 가능한 계좌 수: " + (accountsLimit - enrollment));
                            break;
                        } else if (accounts[accounts.length - 1] != null) {
                            System.out.println("더이상 계좌를 개설할 수 없습니다. (최대 10개 가능)");
                            break;
                        } else {
                            System.out.println("계좌명을 입력하세요");
                            System.out.print(">> ");
                            String accountName = scanner.nextLine();
                            accounts[x + 1] = new Account(accountName);
                            System.out.println(accountName + " 계좌가 개설되었습니다!");
                            enrollment++;
                            System.out.println("추가등록 가능한 계좌 수: " + (accountsLimit - enrollment));
                            break;
                        }
                    }
                    break;

                case "2": //입금
                    for (int x = 0; x < accounts.length; x++) {
                        if (accounts[i] == null) {
                            System.out.println("거래 전 계좌를 먼저 생성해주세요.");
                        } else {
                            System.out.print("입금액: ");
                            money = Integer.parseInt(scanner.nextLine());
                            accounts[i].deposit(money);
                        }
                        break;
                    }
                    break;

                case "3": //출금
                    for (int x = 0; x < accounts.length; x++) {
                        if (accounts[i] == null) {
                            System.out.println("거래 전 계좌를 먼저 생성해주세요.");
                        } else {
                            System.out.print("출금액: ");
                            money = Integer.parseInt(scanner.nextLine());
                            accounts[i].withdraw(money);
                        }
                        break;
                    }
                    break;

                case "4": //잔액 확인
                    if (accounts[i] == null) {
                        System.out.println("거래 전 계좌를 먼저 생성해주세요.");
                    } else {
                        System.out.println("현재 계좌의 잔액은 " + accounts[i].getBalance() + "원입니다.");
                    }
                    break;

                case "5": //계좌 폐지
                    if (accounts[i] == null) {
                        System.out.println("폐지할 계좌가 없습니다.");
                    } else {
                        for (i = 0; i < accounts.length; i++) {
                            System.out.println((i + 1) + "번째 계좌를 폐지하시겠습니까? (폐지: a, 유지: b)");
                            abolition = String.valueOf((scanner.nextLine()));
                            switch (abolition) {
                                case "a":
                                    accounts[i] = null;
                                    enrollment--;
                                    System.out.println(Arrays.toString(accounts));
                                    break;
                                case "b":
                                    System.out.println(Arrays.toString(accounts));
                                    break;
                            }
                            break;
                        }
                        break;
                    }


                case "6": //계좌 현황
                    for (int x = 0; x < accounts.length; x++) {
                        if (accounts[i] == null) {
                            System.out.println("현재 개설된 계좌가 존재하지 않습니다.");
                            break;
                        } else {
                            System.out.println(Arrays.toString(accounts));
                            break;
                        }
                    }
                    break;

                case "7": //종료
                    System.out.println("은행 거래를 종료합니다.");
                    stop = true;
                    break;

                default: //case "1"~"7" 외의 입력값을 입력한 경우
                    System.out.println("1~7번까지의 메뉴 번호 중 입력해주세요.");
                    break;
            }
        }
        while (!stop);
    }
}