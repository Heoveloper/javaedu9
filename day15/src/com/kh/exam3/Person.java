package com.kh.exam3;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals() 호출됨!");
        boolean flag = false;
        if (o instanceof Person) {
            Person p = (Person) o;
            if (this.name.equals(p.name) && this.age == p.age) {
//            if (this.name.equals(p.name)) {   //이름만 같아도 동등
                flag = true;
            }
        }
        return flag;
    }

    //이름과 나이가 같으면 동일한 해시코드를 반환하게끔 재정의
    @Override
    public int hashCode() {
        System.out.println("hashcode() 호출됨!");
        return Objects.hashCode(name) + age;
//            return Objects.hashCode(name);    //이름만 같아도 동일 해시코드 반환
    }
}
