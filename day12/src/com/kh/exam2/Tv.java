package com.kh.exam2;

public class Tv implements HomeAppliances, Internet {

    //전원을 켜다
    @Override
    public void on() {
        System.out.println("TV를 켜다");
    }

    //전원을 끄다
    @Override
    public void off() {
        System.out.println("TV를 끄다");
    }

    //검색하다
    @Override
    public String search(String keyword) {
        return keyword;
    }
}
