package com.kh.exercise12.q3;

public class Main {
    public static void main(String[] args) {
//        A b = new A(); (X)

        A a = new A() {
            @Override
            void abc() {
                System.out.println("반갑습니다");
            }
        };

        A b = new A() {
            @Override
            void abc() {
                System.out.println("반갑습니다");
            }
        };

        b.abc();

        A c = new B();
        c.abc();
        A d = new B();
        d.abc();

        A e = new A(){
            @Override
            void abc() {
                System.out.println("반갑습니다");
            }
        };
    }
}
