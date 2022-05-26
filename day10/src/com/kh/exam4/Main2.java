package com.kh.exam4;

public class Main2 {
    public static void main(String[] args) {
        int x = 10;
        double y = x; //자동 형변환 //작은 타입을 큰 타입에 대입(O)

        double i = 20;
        //int j = i; //큰 타입을 작은 타입에 대입(X)
        int j = (int) i;    //큰 타입을 작은 타입에 대입하려면 형변환 연산자를 사용해
                            //값의 손실이 없는 전제 하에 '강제 형변환'해준다.

        byte k = 127;     // -128 ~ 127까지의 값의 범위를 갖는다.

        byte l = (byte) (k + 1);//값의 손실이 일어나 의미 없는 강제 형변환
        System.out.println(l);  //128이 아닌 -128이 출력 (byte 값의 범위를 초과)

        byte m = (byte) (k - 1);//값의 손실이 없어서 의미 있는 강제 형변환
        System.out.println(m);

        int a = 10;     //a의 값이 10이면 의미(O)
        //int a = 200;  //a의 값이 200이면 의미(X)
        byte b = (byte)a;
        System.out.println(b);
    }
}
