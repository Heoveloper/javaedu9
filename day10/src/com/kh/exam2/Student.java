package com.kh.exam2;

public class Student extends Person //Student의 상위개념 Person
{
    {
        System.out.println("4");
    }

    static {
        System.out.println("7");
    }

    public Student() {
        super(); //super()는 실행문의 가장 상단에 위치해야 한다
        System.out.println("1");
        System.out.println("2");
    }
}
