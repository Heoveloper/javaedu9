package com.kh.exercise.q7;

class Main {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.abc(3.8);
            a.abc(2.5);
        } catch (ScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
