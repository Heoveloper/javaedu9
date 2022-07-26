package com.kh.exercise.q6;

class A2 {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
        void bcd () throws InterruptedException, ClassNotFoundException {
            Thread.sleep(1_000);
            Class.forName("java.lang.Object");
        }
    }