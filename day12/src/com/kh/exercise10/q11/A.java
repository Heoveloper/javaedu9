package com.kh.exercise10.q11;
/*
    Object.equals(): 동일비교(==)로 정의되어있다.
    동등비교를 하기 위해서는 Object.equals()를 재정의해서 사용해야 한다

    동일비교: 인스턴스의 실체가 같은지 비교 (주소비교)
    동등비교: 인스턴스의 속성값이 같은지 비교 (내용비교)
*/

public class A {
    int data;
    A(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;

        if (obj instanceof A) {
            if (this.data == ((A) (obj)).data) {
                result = true;
            }
        }
        return result;
    }
}
