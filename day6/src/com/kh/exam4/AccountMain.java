package com.kh.exam4;

//���� Ŭ����
public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();

        //������ �̸��� �־��� ������ �����Ѵ�
        account.setAccountHolderName("������");

        //�ܰ� �־��� ������ �����Ѵ�
        account.setBankBalance(50000);

        //������ �̸��� �˷��ش�
        account.getAccountHolderName();

        //�ܰ� �˷��ش�
        account.getBankBalance();

        //�־��� �ݾ��� �Ա��Ѵ�
        account.setDeposit(50000);

        //�־��� �ݾ��� ����Ѵ�
        account.setWithdraw(30000);

        //���ݰ����� ��� �����Ͱ��� �˷��ش�
        System.out.println(account.toString());
    }
}
