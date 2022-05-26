package com.kh.exam2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/*
    checked exception: 컴파일 시점에 반드시 예외 처리 해야하는 예외
*/

public class CheckedException {
    public static void main(String[] args) throws Exception {
        // Checked Exception(일반 예외)

        // 1. InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // 2. ClassNotFoundException
        try {
            Class cls = Class.forName("java.lang.Object");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 3. IOException
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 4. FileNotFoundException
        try {
            FileInputStream fis = new FileInputStream("text.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 5. CloneNotSupportedException
        A a1 = new A();
        A a2 = (A)a1.clone();
    }
}
