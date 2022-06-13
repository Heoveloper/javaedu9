package com.kh.exam2;

public class Dice {

    //멤버 필드
    private int faceValue;  //주사위눈의 상태값

    public Dice() {
        this.faceValue = 1;
    }


    //멤버 메소드
    //주사위를 굴리는 행위
    //this: new 생성자 메소드()로 생성될 인스턴스(객체)
    public void roll() {
        this.faceValue = (int) Math.floor(Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}

//    public void setFaceValue(int num) {
//        if ( num >= 1 && num <= 6) {
//            this.faceValue = num;
//        }
//    }




/*
    //멤버 필드
    public int num1;
    public int num2;
    public boolean throwing;

    //생성자
    public Dice() {
        super();
    }


    //멤버 메소드
    public void throwOn() {
        this.throwing = true;
    }

    public void throwOff() {
        this.throwing = false;
    }

    public boolean isThrowing() {
        return this.throwing;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }
*/
