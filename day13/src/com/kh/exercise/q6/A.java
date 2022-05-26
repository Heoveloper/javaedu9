package com.kh.exercise.q6;

class A {
    void abc() {
        bcd();
    }

    void bcd() {
        try {
            Thread.sleep(1_000);
            Class.forName("java.lang.Object");
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
