package com.kh.exam4;


//라이브러리 클래스
public class Account {

    //예금주 이름
    private String accountHolderName;
    //잔고
    private int bankBalance;
    private int deposit;
    private int withdraw;

    public Account() {

    }

    /*
    @Override
    public String toString() {
        return "Account{" +
                "예금주 성함= '" + accountHolderName + '\'' +
                ", 잔고= " + bankBalance +
                '}';
    }
    */

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBankBalance(int NewBankBalance) {
        this.bankBalance = NewBankBalance;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public int getBankBalance() {
        return this.bankBalance;
    }

    public int getDeposit(){
        return this.deposit;
    }

    public int getWithdraw() {
        return this.withdraw;
    }


    public void setDeposit(int NewDeposit) {
        this.deposit = NewDeposit;
    }

    public void setWithdraw(int NewWithdraw) {
        this.withdraw = NewWithdraw;
    }

    public String toString() {
        String str = "";
        str += "예금주 성함: " + this.getAccountHolderName() + "\n";
        str += "잔고: " + this.getBankBalance() + "\n";
        str += "입금내역: " + this.getDeposit() + "\n";
        str += "출금내역: " + this.getWithdraw() + "\n";
        return str;
    }
}
