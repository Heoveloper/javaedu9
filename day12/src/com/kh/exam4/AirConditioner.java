package com.kh.exam4;

public class AirConditioner implements HomeAppliances {

    //전원을 켜다
    @Override
    public void on() {
        System.out.println("에어컨을 켜다");
    }

    //전원을 끄다
    @Override
    public void off() {
        System.out.println("에어컨을 끄다");
    }
}
