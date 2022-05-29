package com.kh.exam1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
값은 중복이 되지만 키는 중복이 안된다
만약 키가 중복되면 뒤에 설정한 키로 덮어진다
*/

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        //요소 추가(키, 값 저장)
        dictionary.put("student", "학생");
        dictionary.put("teacher", "교사");
        dictionary.put("lecture", "강좌");
        dictionary.put("classroom", "교실");
        System.out.println(dictionary);

        //요소 검색(키 존재 여부)
        System.out.println(dictionary.containsKey("student"));  //true
        System.out.println(dictionary.containsKey("student1")); //false

        //요소 검색(값 존재 여부)
        System.out.println(dictionary.containsValue("학생"));     //true
        System.out.println(dictionary.containsValue("학생1"));    //false

        //요소 검색(주어진 키로 값 반환)
        System.out.println(dictionary.get("student"));  //학생

        System.out.println("==========");

        //요소 검색(모든 키 반환)
        Set<String> setA = dictionary.keySet();
        for (String elements : setA) {
            System.out.println(elements);
        }

        System.out.println("==========");

        //요소 검색(모든 값 반환)
        Collection<String> values = dictionary.values();
        for (String elements : values) {
            System.out.println(elements);
        }
        
        //요소 검색(키와 값의 쌍으로 구성된 Map.Entry 반환)
        Set<Map.Entry<String, String>> entries = dictionary.entrySet();

        for (Map.Entry<String, String> elements : entries) {
            System.out.println(elements.getKey() + ":" + elements.getValue());
        }

        //요소 검색(요소가 비어있는지 여부)
        System.out.println(dictionary.isEmpty());   //false

        //요소 검색(요소 수)
        System.out.println(dictionary.size());      //4

        //요소 삭제(키로 검색된 요소 삭제)
        dictionary.remove("student");
        System.out.println(dictionary);

        //요소 삭제(키, 값 쌍으로 검색된 요소 삭제)
        dictionary.remove("teacher", "교사");
        System.out.println(dictionary);

        //요소 삭제(전체)
        dictionary.clear();
        System.out.println(dictionary.size());
        System.out.println(dictionary);
    }
}
