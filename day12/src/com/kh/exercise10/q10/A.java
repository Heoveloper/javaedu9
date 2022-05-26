package com.kh.exercise10.q10;

/*
    1. super(); 부모의 생성자 호출
    2. this(); 자신의 생성자 호출
    3. super(); this(); 같이 올 수 없다
*/

public class A {
    A() {
        System.out.println("A 생성자1");
    }
    A(int a) {
        this();
        System.out.println("A 생성자2");
    }
}
