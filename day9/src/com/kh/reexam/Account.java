package com.kh.reexam;

public class Account {
    private final int DEPOSIT_LIMIT = 40000;            //입금 한도
    private final int WITHDRAW_LIMIT = 40000;           //출금 한도
    private final int DEPOSIT_AMOUNT_LIMIT = 100_000;   //예치금액 한도
    private final int ACCOUNT_NUMBER_LENGTH = 3;        //계좌번호 3자리

    private String accountOwner;    //예금주 이름
    private String accountNumber;   //계좌번호
    private static int accountCnt;  //계좌번호 카운트
    private int balance;            //잔고

    public Account(String accountOwner) {
        this.accountOwner = accountOwner;
        this.accountNumber = createAccountNumber(++accountCnt); //계좌번호 생성
    }

    //계좌번호 서식에 맞춰 생성
    private String createAccountNumber(int accountCnt) {
        String str = "" + accountCnt;
        int addZero = ACCOUNT_NUMBER_LENGTH - str.length();
        for (int i = 0; i < addZero; i++) {
            str = "0" + str;
        }
        return str;
    }

    //입금
    public void deposit(int money) {
        //1회 입금한도 제한 (4만원)
        if (money <= 0 || money > DEPOSIT_LIMIT) {
            System.out.println("1회 입금한도는 4만원이며 0원보다 많은 금액만 입금 가능합니다.");
            System.out.println();
            return;
        }
        //예치금액 제한 (10만원까지 보유 가능)
        else if (balance + money > DEPOSIT_AMOUNT_LIMIT) {
            System.out.println("예치금은 10만원까지 보유 가능합니다.");
            System.out.println();
            return;
        } else {
            balance += money;
            System.out.println(money + "원 입금되었습니다.");
        }

    }

    //출금
    public void withdraw(int money) {
        //1회 출금한도 제한 (4만원)
        if (money <= 0 || money > WITHDRAW_LIMIT) {
            System.out.println("1회 출금한도는 4만원이며 0원보다 많은 금액만 출금 가능합니다.");
            System.out.println();
            return;
        }
        //마이너스 잔고 허용 불가
        else if (balance - money < 0) {
            System.out.println("보유한 금액 이상만 출금 가능합니다.");
            System.out.println();
            return;
        } else {
            balance -= money;
            System.out.println(money + "원 출금되었습니다.");
        }
    }

    //조회
    @Override
    public String toString() {
        return "예금주명: " + accountOwner +
                ", 계좌번호: " + accountNumber +
                ", 잔액: " + balance + "\n";
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
