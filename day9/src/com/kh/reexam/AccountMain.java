package com.kh.reexam;

import java.util.Scanner;

public class AccountMain {
    static final int NOT_FOUND = -1;
    static final int ACCOUNT_LIMIT = 5;

    public static void main(String[] args) {

        Account[] accounts = new Account[5];
        Scanner scanner = new Scanner(System.in);


        boolean stop = false; //반복문 제어
        do {
            String accountOwner;
            String accountNumber;
            
            int ordinal = NOT_FOUND;
            int money = 0;

            System.out.println("[거래하고자 하는 메뉴 번호를 선택하세요.]");
            System.out.println("1.신규 2.폐지 3.입금 4.출금 5.개별계좌조회 6.전체계좌조회 7.종료");
            System.out.print(">> ");

            int menuNum = Integer.parseInt(scanner.nextLine()); //입력할 메뉴 번호

            switch (menuNum) {
                case 1: //신규
                    System.out.println();
                    System.out.println("[계좌 신규 개설]");
                    System.out.print("이름 >> ");
                    accountOwner = scanner.nextLine();
                    
                    ordinal = findNull(accounts);

                    if (ordinal == NOT_FOUND) {
                        System.out.println("더 이상 계좌를 개설하실 수 없습니다.");
                        System.out.println("계좌 개설 한도: " + ACCOUNT_LIMIT);
                        continue;
                    }
                    //같은 이름 계좌 확인
                    else if (dupCheck(accounts, accountOwner)) {
                        System.out.println("같은 이름의 계좌가 이미 존재합니다.");
                        System.out.println();
                        continue;
                    }
                    else {
                        accounts[ordinal] = new Account(accountOwner);
                        System.out.println("'" + accountOwner + "'님의 계좌가 신규 생성되었습니다.");
                        System.out.println(accounts[ordinal]);
                    }
                    break;

                case 2: //폐지
                    System.out.println();
                    System.out.println("[계좌 폐지]");
                    System.out.print("폐지를 원하는 계좌의 계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    ordinal = findOrdinal(accounts, accountNumber);
                    if (ordinal == NOT_FOUND) {
                        System.out.println("해당 계좌번호의 계좌가 존재하지 않습니다.");
                        System.out.println();
                        continue;
                    } else {
                        //잔액 유무 확인
                        if (accounts[ordinal].getBalance() > 0) {
                            System.out.println("잔액이 존재하는 계좌는 폐지가 불가능합니다.");
                            System.out.println(accounts[ordinal].toString());
                            continue;
                        }
                        accounts[ordinal] = null;
                        System.out.println("계좌번호 " + accountNumber + "번의 계좌가 폐지되었습니다.");
                        System.out.println();
                    }
                    break;

                case 3: //입금
                    System.out.println();
                    System.out.println("[입금]");
                    System.out.print("입금을 원하는 계좌의 계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    ordinal = findOrdinal(accounts, accountNumber);
                    if (ordinal == NOT_FOUND) {
                        System.out.println("해당 계좌번호의 계좌가 존재하지 않습니다.");
                        System.out.println();
                    } else {
                        System.out.print("입금액 >> ");
                        money = Integer.parseInt(scanner.nextLine());
                        accounts[ordinal].deposit(money);
                        System.out.println(accounts[ordinal].toString());
                        System.out.println();
                    }
                    break;

                case 4: //출금
                    System.out.println();
                    System.out.println("[출금]");
                    System.out.print("출금을 원하는 계좌의 계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    ordinal = findOrdinal(accounts, accountNumber);
                    if (ordinal == NOT_FOUND) {
                        System.out.println("해당 계좌번호의 계좌가 존재하지 않습니다.");
                        System.out.println();
                    } else {
                        System.out.print("출금액 >> ");
                        money = Integer.parseInt(scanner.nextLine());
                        accounts[ordinal].withdraw(money);
                        System.out.println(accounts[ordinal].toString());
                        System.out.println();
                    }
                    break;

                case 5: //조회(개별)
                    System.out.println();
                    System.out.print("계좌번호 >> ");
                    accountNumber = scanner.nextLine();
                    ordinal = findOrdinal(accounts, accountNumber);
                    if (ordinal == NOT_FOUND) {
                        System.out.println("입력하신 계좌번호를 가진 계좌가 존재하지 않습니다.");
                        System.out.println();
                    } else {
                        System.out.println(accounts[ordinal].toString());
                    }
                    break;

                case 6: //조회(전체)
                    allAccountInquiry(accounts);
                    break;

                case 7: //종료
                    stop = true;
                    break;

                default:
                    System.out.println("1~7까지의 메뉴 번호 중 입력해주세요.");
                    System.out.println();
            }
        } while (!stop);
        System.out.println("거래가 종료되었습니다.");
    }

    //비어있는 계좌(Null)의 배열 번호 반환 //빈 계좌가 없으면 -1 반환
    private static int findNull(Account[] accounts) {
        int findedNull = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                findedNull = i;
                break;
            }
        }
        return findedNull;
    }

    //이름 중복 확인
    private static boolean dupCheck(Account[] accounts, String accountOwner) {
        boolean dupChk = false;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            } else if (accounts[i].getAccountOwner().equals(accountOwner)) {
                dupChk = true;
                break;
            }
        }
        return dupChk;
    }
    
    //찾고자 하는 계좌의 배열 번호 반환 //존재하지 않으면 -1 반환
    private static int findOrdinal(Account[] accounts, String accountNumber) {
        int findedOrdinal = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            }
            String strAccountNumber = accounts[i].getAccountNumber();
            if (strAccountNumber.equals(accountNumber)) {
                findedOrdinal = i;
                break;
            }
        }
        return findedOrdinal;
    }

    //모든 계좌 정보 출력
    private static void allAccountInquiry(Account[] accounts) {
        int accountCnt = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            } else {
                System.out.println(accounts[i].toString());
                ++accountCnt;
            }
        }
        System.out.print("사용중인 계좌 수: " + accountCnt);
        System.out.println(", 잔여 계좌 수: " + (accounts.length - accountCnt));
        System.out.println();
    }
}
