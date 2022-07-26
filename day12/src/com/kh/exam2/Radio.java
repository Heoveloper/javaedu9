package com.kh.exam2;

public class Radio implements HomeAppliances {

    //전원을 켜다
    @Override
    public void on() {
        System.out.println("라디오를 켜다");
    }

    //전원을 끄다
    @Override
    public void off() {
        System.out.println("라디오를 끄다");
    }
}
