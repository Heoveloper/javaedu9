package com.kh.exam4;

//실행 클래스
public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        //예금주 이름을 주어진 값으로 변경한다
        account.setAccountHolderName("허준혁");

        //잔고를 주어진 값으로 변경한다
        account.setBankBalance(50000);

        //예금주 이름을 알려준다
        account.getAccountHolderName();

        //잔고를 알려준다
        account.getBankBalance();

        //주어진 금액을 입금한다
        account.setDeposit(50000);

        //주어진 금액을 출금한다
        account.setWithdraw(30000);

        //예금계좌의 모든 데이터값을 알려준다
        System.out.println(account.toString());
    }
}
