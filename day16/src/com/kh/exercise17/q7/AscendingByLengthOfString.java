package com.kh.exercise17.q7;

import java.util.Comparator;

//문자열 길이 오름차순 (이름 있는 구현클래스)
public class AscendingByLengthOfString implements Comparator<MyData> {

    @Override
    public int compare(MyData o1, MyData o2) {
        int result = 0;
        if (o1.str.length() > o2.str.length()) {
            result = 1;
        } else if (o1.str.length() < o2.str.length()) {
            result = -1;
        }
        return result;
    }
}
