package com.kh.exam;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Account accounts[] = new Account[5];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int enrollment = 0;

        boolean stop = false;

        do {
            System.out.println("[메뉴] 1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");

            System.out.print("원하시는 거래에 맞는 번호를 입력하세요. >> ");

            int menuNum = Integer.parseInt(scanner.nextLine());

            switch (menuNum) {
                case 1:
                    for (i = 0; i < accounts.length; i++) {
                        if (accounts[i] == null) {
                            System.out.println("개설된 계좌가 없습니다.");
                            System.out.print("만드실 계좌명을 입력해주세요: ");
                            String accountOwner = scanner.nextLine();
                            accounts[i] = new Account(accountOwner);
                            enrollment++;
                            System.out.println("축하합니다! 계좌가 개설되었습니다! (계좌번호: " + (enrollment -1) + ")");
                            System.out.println("(개설하신 계좌명: " + accountOwner + ", 추가로 개설 가능한 계좌 수: " + (5 - enrollment) + ")");
                            break;
                        } else if (accounts[accounts.length - 1] != null) {
                            System.out.println("더이상 계좌를 개설하실 수 없습니다. (총 개설 가능 계좌 수: 5");
                            break;
                        } else {
                                System.out.print("만드실 계좌명을 입력해주세요: ");
                                String accountOwner = scanner.nextLine();
                                accounts[i + 1] = new Account(accountOwner);
                                enrollment++;
                                System.out.println("축하합니다! 계좌가 개설되었습니다! (계좌번호: " + (i + 1) + ")");
                                System.out.println("(개설하신 계좌명: " + accountOwner + ", 추가로 개설 가능한 계좌 수: " + (5 - enrollment) + ")");
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("폐지할 계좌번호를 입력해주세요. >> ");
                    int accountNum = Integer.parseInt(scanner.nextLine());
                    boolean abolition;
                    abolition = accounts[accountNum] == null;
                    enrollment--;
                    System.out.println("폐지가 완료되었습니다.");
                    break;

                case 3:
                    System.out.print("입금하실 계좌번호를 입력해주세요. >> ");
                    int depositAccountNum = Integer.parseInt(scanner.nextLine());
                    System.out.print("입금하실 금액을 입력해주세요. >> ");
                    int depositmoney = Integer.parseInt(scanner.nextLine());
                    accounts[depositAccountNum].deposit(depositmoney);
                    break;

                case 4:
                    System.out.print("출금하실 계좌번호를 입력해주세요. >> ");
                    int withdrawAccountNum = Integer.parseInt(scanner.nextLine());
                    System.out.print("출금하실 금액을 입력해주세요. >> ");
                    int withdrawmoney = Integer.parseInt(scanner.nextLine());
                    accounts[withdrawAccountNum].withdraw(withdrawmoney);
                    break;

                case 5:
                    System.out.print("조회하실 계좌번호를 입력해주세요. >> ");
                    accountNum = Integer.parseInt(scanner.nextLine());
                    accounts[accountNum].accInquiry(accountNum);
                    break;

                case 6:
                    System.out.println("전체 계좌번호를 조회합니다.");
                    for (accountNum = 0; accountNum < accounts.length; accountNum++) {
                        accounts[accountNum].allAccInquiry(accountNum);
                    }
                    break;

                case 7:
                    System.out.println("거래를 종료합니다.");
                    stop = true;
                    break;

                default:
                    System.out.println("1~7의 메뉴 번호 중 입력해주세요.");
                    break;
            }
        } while (!stop);
    }
}
