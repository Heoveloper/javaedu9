package com.kh.task;

public class Voca {

    private String voca;    //단어
    private String meaning; //뜻

    public Voca(String voca, String meaning) {
        this.voca = voca;
        this.meaning = meaning;
    }

    public String getVoca() {
        return voca;
    }

    public String getMeaning() {
        return meaning;
    }

    //목록
    @Override
    public String toString() {
        return "단어: " + voca +
                ", 뜻: " + meaning;
    }
}
