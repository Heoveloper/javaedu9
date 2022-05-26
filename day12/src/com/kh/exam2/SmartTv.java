package com.kh.exam2;

public class SmartTv extends Tv implements SmartInternet {
    //전원을 켜다
    @Override
    public void on() {
        System.out.println("스마트 TV를 켜다");
    }

    //전원을 끄다
    @Override
    public void off() {
        System.out.println("스마트 TV를 끄다");
    }

//    //검색하다
//    @Override
//    public String search(String keyword) {
//        return keyword;
//    }

    //음성인식
    @Override
    public void listenVoice() {
        System.out.println("스마트 TV가 음성을 인식하다");
    }
}
