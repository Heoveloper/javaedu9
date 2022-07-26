package com.kh.exam4;

public class Account {

    Account[] accounts = new Account[100];

    private int LIMIT_MONEY_ONETIME = 100_000;  //1회 입금한도
    private int LIMIT_BALANCE = -1_000_000;     //마이너스 잔액한도
    private String accountOwner;    //계좌 소유자
    private long balance;           //잔액
    private long deposit;           //입금
    private long withdraw;          //출금
    private int money;              //입출금액


    public Account(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public Account(int LIMIT_MONEY_ONETIME, int LIMIT_BALANCE, String accountOwner, long balance) {
        this.LIMIT_MONEY_ONETIME = LIMIT_MONEY_ONETIME;
        this.LIMIT_BALANCE = LIMIT_BALANCE;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    //입금
    public void deposit(int money) {
        if (money < 1 || money > LIMIT_MONEY_ONETIME) {
            System.out.println("1회 입금액은 " + LIMIT_MONEY_ONETIME + " 원 미만이어야 합니다.");
            return;
        }
        this.balance += money;
    }

    //출금
    public void withdraw(int money) {
        if (money <= 0) {
            return;
        }
        if (this.balance - money < LIMIT_BALANCE) {
            System.out.println("잔액 한도는 " + LIMIT_BALANCE +" 원입니다.");
            return;
        }
        this.balance -= money;
    }

    //잔액
    public long getBalance() {
        return this.balance;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

}


/*
public class Account {
    private String accountName;

    private int money;

    private int deposit;

    private int withdraw;


    public Account() {
        super();
    }

    public Account (String accountName, int money) {
        this.accountName = accountName;
        this.money = money;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }
}
*/
