package com.kh.exam4;

import java.lang.*;

public class Person {
    private String name;    //�̸�
    private int age;        //����
    private String gender;  //����
    public Person(String name, int age, String gender) {
        super(); //���� ������ ����Ʈ ������ ȣ��
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //toString() �޼��� �뵵: ���� �ν��Ͻ��� ���¸� ���ڿ��� ǥ��
    //alt+insert - toString() ������ ��� (PersonMain.java�� ����)
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
