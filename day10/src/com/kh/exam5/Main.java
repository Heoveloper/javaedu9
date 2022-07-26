package com.kh.exam5;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        double result = sum(x, y); //int 타입으로 변환된 sum 을 double 타입으로 자동 형변환

        /*
        byte result = (byte) sum(x, y);
        이런 식으로 사용하려고 하면 sum 의 값이 byte 타입의 범위 안이어야
        의미 있는 강제 형변환
        */
    }

    public static int sum(double x, double y) {
        return (int) (x + y); //double 타입의 x+y를 int 타입으로 강제 형변환
    }
}
