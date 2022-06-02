package com.kh.dic;

import java.util.TreeMap;

public class Dictionary implements Comparable<Dictionary> {
    TreeMap<String, String> dictionary = new TreeMap<>();

    private String vocabulary = null;
    private String meaning = null;

    public Dictionary() {
        this.vocabulary = vocabulary;
        this.meaning = meaning;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public String getMeaning() {
        return meaning;
    }

    @Override
    public String toString() {
        return "단어: " + vocabulary +
                "뜻: " + meaning;
    }

    public int compareTo(Dictionary o1) {
        int result = 0;
        if (this.vocabulary.length() > o1.vocabulary.length()) {
            result = -1;
        } else if (this.vocabulary.length() < o1.vocabulary.length()) {
            result = 1;
        }
        return result;
    }
}
