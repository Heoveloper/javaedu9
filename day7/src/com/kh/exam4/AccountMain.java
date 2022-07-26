package com.kh.exam4;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;
        do {
            //메뉴 출력
            if (account == null) {
                System.out.println("[메뉴] 1.계좌 개설 5.종료");
            } else {
                System.out.println("[메뉴] 1.계좌 개설 2.입금 3.출금 4.잔액조회 5.종료");
            }
            System.out.println(">>");
            String menuValue = scanner.nextLine();

            int money = 0; //입출금액

            switch (menuValue) {
                case "1": //계좌 개설
                    System.out.println("이름을 입력하세요");
                    System.out.println(">>");
                    String name = scanner.nextLine();
                    account = new Account(name);
                    System.out.println(name + "님의 계좌가 개설되었습니다.");
                    break;

                case "2": //입금
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    }
                    System.out.print("입금액: ");
                    money = Integer.valueOf(scanner.nextLine());
                    account.deposit(money);
                    System.out.println("잔고는 " + account.getBalance() + "원입니다.");
                    break;

                case "3": //출금
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    }
                    System.out.print("출금액: ");
                    money = Integer.valueOf(scanner.nextLine());
                    account.withdraw(money);
                    System.out.println("잔고는 " + account.getBalance() + "원입니다.");
                    break;

                case "4": //잔액 조회
                    //1) 계좌 개설 유무 체크
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    }
                    long balance = account.getBalance();
                    System.out.println(account.getAccountOwner() + "님의 잔액: " + balance + "원입니다.");
                    break;

                case "5": //종료
                    System.out.println("ATM을 종료합니다.");
                    stop = true;
                    break;
                default:

            }
        } while (!stop);
    }
}




/*
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

    }
}
*/
