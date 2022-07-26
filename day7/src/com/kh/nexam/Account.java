package com.kh.nexam;

public class Account {

    private int depositLimit = 100_000; //1회 입금한도
    private int withdrawLimit = -1_000_000; //마이너스 잔액한도
    private String name; //계좌명
    private int balance; //잔액

    public Account(String name) {
        this.name = name;
    }

    public long getBalance() {
        return this.balance;
    }

    //입금
    public void deposit(int money) {
        if (money <= 0 || money > depositLimit) {
            System.out.println("0원보다 많은 금액만 입금 가능하며 1회 입금한도는 10만원입니다.");
        } else {
            balance += money;
            System.out.println(money + "원 정상적으로 입금되었으며 잔액은 " + getBalance() + "원입니다.");
        }

    }

    //출금
    public void withdraw(int money) {
        if (money <= 0 || getBalance() < withdrawLimit) {
            System.out.println("0원보다 많은 금액만 출금 가능하며 마이너스 잔액한도는 100만원입니다.");
        } else {
            balance -= money;
            System.out.println(money + "원 정상적으로 출금되었으며 잔액은 " + getBalance() + "원입니다.");
        }
    }
}