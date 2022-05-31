package com.kh.exercise17.q7;

public class MyData implements Comparable<MyData> {
    String str;

    public MyData(String str) {
        this.str = str;
    }

    @Override
    public int compareTo(MyData o) {

        //오름차순 정렬 (반대로 빼면 내림차순 정렬)
//        return str.length() - o.str.length();

        //가나다순 정렬
//        return this.str.compareTo(o.str);

        //오름차순 정렬 (양수, 음수 바꾸면 내림차순 정렬)
        int result = 0;
        if (this.str.length() > o.str.length()) {
            result = 1;
        } else if (this.str.length() < o.str.length()) {
            result = -1;
        }
        return result;

    }

    @Override
    public String toString() {
        return str;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
