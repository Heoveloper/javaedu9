package com.kh.exam4;


//���̺귯�� Ŭ����
public class Account {

    //������ �̸�
    private String accountHolderName;
    //�ܰ�
    private int bankBalance;
    private int deposit;
    private int withdraw;

    public Account() {

    }

    /*
    @Override
    public String toString() {
        return "Account{" +
                "������ ����= '" + accountHolderName + '\'' +
                ", �ܰ�= " + bankBalance +
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
        str += "������ ����: " + this.getAccountHolderName() + "\n";
        str += "�ܰ�: " + this.getBankBalance() + "\n";
        str += "�Աݳ���: " + this.getDeposit() + "\n";
        str += "��ݳ���: " + this.getWithdraw() + "\n";
        return str;
    }
}
