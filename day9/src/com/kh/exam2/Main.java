package com.kh.exam2;

/*
public class면 모든 패키지에서 접근, 사용 가능하지만
public 없이 그냥 class면 해당 package 안에서만 접근, 사용 가능
*/

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int result = sum(10, 20);

        Main main = new Main();
        main.sum2(x, y);
    }

    public static int sum(int left, int right) {
        int result = 0;
        result = left + right;
        return result;
    }

    private int sum2(int x, int y) {
        return x + y;
    }
}
