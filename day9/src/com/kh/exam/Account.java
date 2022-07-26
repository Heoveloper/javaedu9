package com.kh.exam;

public class Account {


    private final int DEPOSIT_LIMIT = 40000; //입금 한도
    private final int WITHDRAW_LIMIT = 40000; //출금 한도

    private String accountOwner;
    private int balance;
    private int accountNum;
    private int enrollment; //등록된 계좌 수

    public Account(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getDEPOSIT_LIMIT() {
        return DEPOSIT_LIMIT;
    }

    public int getWITHDRAW_LIMIT() {
        return WITHDRAW_LIMIT;
    }

    public String getAccountOwner(int accountNum) {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getBalance(int accountNum) {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNum(int accountNum) {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public int getEnrollment(int enrollment) {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public void deposit(int depositmoney) {
        if (depositmoney > DEPOSIT_LIMIT || depositmoney <= 0) {
            System.out.println("1회 입금한도는 4만원이며 0원 이하로는 입금이 되지 않습니다.");
        } else if (getBalance(accountNum) > 100000) {
            System.out.println("예치금액은 10만원까지 보유 가능합니다.");
        } else {
            balance += depositmoney;
            System.out.println(depositmoney + "원 정상적으로 입금되었습니다.");
        }
    }

    public void withdraw(int withdrawmoney) {
        if (withdrawmoney > WITHDRAW_LIMIT || withdrawmoney > getBalance(accountNum)) {
            System.out.println("1회 출금한도는 4만원이며 보유하신 금액보다 많은 금액을 출금하실 수는 없습니다.");
        } else {
            balance -= withdrawmoney;
            System.out.println(withdrawmoney + "원 정상적으로 출금되었습니다.");
        }
    }


    public void accInquiry(int accountNum) {
        System.out.println("예금주 이름: " + accountOwner + ", 잔고: " + balance + "원");
        getAccountOwner(accountNum);
        getBalance(accountNum);
    }

    public void allAccInquiry(int accountNum) {
        System.out.println("계좌번호: " + accountNum + ", 예금주 이름: " + accountOwner + ", 잔고: " + balance + "원, 사용중인 계좌 수: " + enrollment + ", 잔여 계좌 수: " + (5 - enrollment));
        getAccountNum(accountNum);
        getAccountOwner(accountNum);
        getBalance(accountNum);
        getEnrollment(enrollment);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
