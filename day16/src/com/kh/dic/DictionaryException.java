package com.kh.dic;

import java.util.TreeMap;

public class DictionaryException extends Throwable {
    public static void main(String[] args) throws RuntimeException {
        TreeMap<String, String> dictionary = new TreeMap<>();

        String vocabulary = null;
        String storeVocabulary = null;
        String storeMeaning = null;

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            System.out.println("이미 등록되었습니다.");
        }

    }
}
