package com.kh.account2;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {

    private static final int OPEN_ACCOUNT_LIMIT = 5;   //계좌개설 수 한도
    private Account[] accounts = new Account[OPEN_ACCOUNT_LIMIT];

    static final int NOT_FOUND = -1;


    //신규
    public void createAccount(String accountName) {

        //비어있는 요소 찾아오기
        int idx = findNullIndex();
        if (idx == NOT_FOUND) {
            System.out.println("계좌 개설 한도가 모두 찼습니다.");
            return;
        }
        accounts[idx] = new Account(accountName);
        System.out.println(accountName + "님의 신규 계좌가 생성되었습니다.");
        System.out.println(accounts[idx]);
    }

    //폐지
    public void closeAccount(String accountNumber) {
        int idx = findIndexOfAccount(accountNumber);
        if (idx == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        //잔액 유무 체크
        if (accounts[idx].getBalance() > 0) {
            System.out.println("잔액이 존재합니다.");
            System.out.println(accounts[idx]);
        } else {
            accounts[idx] = null;
        }
    }

    //입금
    public void deposit(String accountNumber, int money) {
        int idx = findIndexOfAccount(accountNumber);
        if (idx == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        accounts[idx].deposit(money);
        System.out.println(accounts[idx].toString());
    }

    //출금
    public void withdraw(String accountNumber, int money) {
        int idx = findIndexOfAccount(accountNumber);
        if (idx == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        accounts[idx].withdraw(money);
        System.out.println(accounts[idx].toString());
    }

    //조회(개별)
    public void printAccountInfo(String accountNumber) {
        int idx = findIndexOfAccount(accountNumber);
        if (idx == NOT_FOUND) {
            System.out.println("찾고자하는 계좌가 없습니다.");
            return;
        }
        System.out.println(accounts[idx].toString());
    }

    //조회(전체)
    // 모든 계좌정보 출력
    public void printAllAccountInfo() {
        int usingCount = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            } else {
                System.out.println(accounts[i]);
                ++usingCount;
            }
        }
        System.out.println("사용중인 계좌 수: " + usingCount);
        System.out.println("잔여 계좌 수: " + (accounts.length - usingCount));
    }


    //메뉴
    public void displayMenu() {
        System.out.println(Arrays.toString(accounts));
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        outer:
        while (!stop) {
            int idx = NOT_FOUND;
            String accountName = null;  //예금주이름
            String accountNumber = null; //계좌번호
            int money = 0;

            System.out.println("메뉴>> 1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
            System.out.print("선택>> ");
            String menu = scanner.nextLine();

            switch (menu) {

                case "1": //신규
                    System.out.print("이름>> ");
                    accountName = scanner.nextLine();
                    //비어있는 요소 찾아오기
                    idx = findNullIndex();
                    if (idx == NOT_FOUND) {
                        System.out.println("계좌 개설 한도가 모두 찼습니다.");
                        continue;
                    }
                    accounts[idx] = new Account(accountName);
                    System.out.println(accountName + "님의 신규 계좌가 생성되었습니다.");
                    System.out.println(accounts[idx]);
                    break;

                case "2": //폐지
                    System.out.print("계좌번호>> ");
                    accountNumber = scanner.nextLine();
                    idx = findIndexOfAccount(accountNumber);
                    if (idx == NOT_FOUND) {
                        System.out.println("찾고자하는 계좌가 없습니다.");
                        continue;
                    }
                    //잔액 유무 체크
                    if (accounts[idx].getBalance() > 0) {
                        System.out.println("잔액이 존재합니다.");
                        System.out.println(accounts[idx]);
                    } else {
                        accounts[idx] = null;
                    }
                    break;

                case "3": //입금

                    int limitCnt = 0;    //제한 횟수
                    while (true) {
                        System.out.print("계좌번호>> ");
                        accountNumber = scanner.nextLine();
                        idx = findIndexOfAccount(accountNumber);
                        if (idx == NOT_FOUND) {
                            System.out.println("찾고자하는 계좌가 없습니다.");
                            if (++limitCnt == 3) {
                                continue outer; //중첩반복문에서 2단계 이상으로 분기하고자 할 때 라벨 사용
                            }
                            continue;
                        }
                        break;
                    }

                    System.out.print("입금액>> ");
                    money = Integer.parseInt(scanner.nextLine());
                    accounts[idx].deposit(money);
                    System.out.println(accounts[idx].toString());
                    break;

                case "4": //출금

                    System.out.print("계좌번호>> ");
                    accountNumber = scanner.nextLine();
                    idx = findIndexOfAccount(accountNumber);
                    if (idx == NOT_FOUND) {
                        System.out.println("찾고자하는 계좌가 없습니다.");
                        continue;
                    }

                    System.out.print("출금액>> ");
                    money = Integer.parseInt(scanner.nextLine());
                    accounts[idx].withdraw(money);
                    System.out.println(accounts[idx].toString());
                    break;

                case "5": //계좌조회(개별)
                    System.out.print("계좌번호>> ");
                    accountNumber = scanner.nextLine();
                    idx = findIndexOfAccount(accountNumber);
                    if (idx == NOT_FOUND) {
                        System.out.println("찾고자하는 계좌가 없습니다.");
                        continue;
                    }
                    System.out.println(accounts[idx].toString());
                    break;

                case "6": //계좌조회(전체)
                    printAllAccount();
                    break;

                case "7": //종료
                    stop = true;
                    continue;

                default:
                    System.out.println("선택한 메뉴가 없습니다!");
            }
        }
    }

    // 모든 계좌정보 출력
    private void printAllAccount() {
        int usingCount = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                continue;
            } else {
                System.out.println(accounts[i]);
                ++usingCount;
            }
        }
        System.out.println("사용중인 계좌 수: " + usingCount);
        System.out.println("잔여 계좌 수: " + (accounts.length - usingCount));
    }


    // 비어있는 요소의 인덱스 번호를 반환, 없으면 -1 반환
    private int findNullIndex() {
        int findedIndex = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                findedIndex = i;
                break;
            }
        }
        return findedIndex;
    }

    //계좌번호와 일치하는 인덱스 번호를 반환, 없으면 -1 반환
    private int findIndexOfAccount(String accountNumber) {
        int findedIndex = NOT_FOUND;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] ==null) {
                continue;
            }
            String tmpAccountNumber = accounts[i].getAccountNumber();
            if (tmpAccountNumber.equals(accountNumber)) {
                findedIndex = i;
                break;
            }
        }
        return findedIndex;
    }
}
