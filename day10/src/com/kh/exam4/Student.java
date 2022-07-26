package com.kh.exam4;

public class Student extends Person //extends 뒤에는 상위개념 하나만 가능
{
    private int studentId;  //학번

    public Student(){
        super();
    }

    public void study() {
        System.out.println("공부하다");
    }

    @Override
    public void eat() {
        System.out.println("많이 먹다");
    }
}
