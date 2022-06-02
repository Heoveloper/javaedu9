package com.kh.exam3;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        TreeMap<String, String> map2 = new TreeMap<>();

        map.put("student", "학생");
        map.put("teacher", "교사");
        map.put("classroom", "교실");

        String word = map.get("student");
        System.out.println(word);

        String word2 = map.get("sTudent");
        System.out.println(word2);

        System.out.println("sTudent".toLowerCase());    //소문자로 변환
        System.out.println("sTudent".toUpperCase());    //대문자로 변환

        String word3 = map.get("sTudent".toLowerCase());
        System.out.println(word3);

        System.out.println("==========");

        //s로 시작하는 단어 찾기
        //범위검색: headMap, tailMap, subMap
        NavigableMap<String, String> subMap = map2.subMap("s", true, "t", false);
        System.out.println(subMap);

        String str = "student";

        //단어 내의 문자위치 from 검색문자
        System.out.println(str.indexOf('u'));   //char
        System.out.println(str.indexOf("u"));   //charSequence
        System.out.println(str.indexOf("z"));   //못 찾으면 -1 반환
        if (str.indexOf('z') != -1) {
            System.out.println("z 문자 포함");
        } else {
            System.out.println("z 문자 미포함");
        }

        //단어 내의 문자추출 from 문자위치
        System.out.println(str.charAt(2));

        //단어 내의 일부 문자추출
        System.out.println(str.substring(0));   //시작 인덱스부터 단어 끝까지 추출
        System.out.println(str.substring(2, 4));    //인덱스 2이상 4미만까지 추출 => Student의 2, 3번째

        //단어 내의 일부 문자를 새로운 문자열로 대체
        System.out.println(str.replace('u', 'o'));
        System.out.println(str.replace("od", "ud"));
        System.out.println(str.replace("ss", "sss"));   //입력 문자열이 없으면 변화 없다
        System.out.println(str.replace('t', 'T'));  //문자가 2개 이상이면 전부 바꾼다

        //단어 내에 특정 문자의 포함 여부
        System.out.println(str.contains("u"));  //문자열의 포함 여부에 따라 Boolean 값으로 반환
        System.out.println(str.contains("ud"));
        System.out.println(str.contains("a"));  //false

        //문자열 연결
        System.out.println(str.concat("s"));    //입력한 문자열을 뒤에 연결해준다

        //문자열을 분리하여 배열로 반환
        String[] tokens = "010-1234-5678".split("-");
        System.out.printf("%s %s %s\n", tokens[0], tokens[1], tokens[2]);

        //문자열 앞뒤 공백 제거
        System.out.println(" student  ".length());  //공백 포함 문자열의 길이 => 10
        System.out.println(" student  ".trim().length());   //공백 3칸 제외한 문자열의 길이 => 7

        //문자열 반복
        System.out.println("s".repeat(10)); //s를 10번 반복
    }
}
