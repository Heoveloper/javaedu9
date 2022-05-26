package com.kh.exam1;

public class Book {
    //멤버


    //멤버 필드

    //인스턴스 멤버 필드 : 인스턴스별로 가져갈 속성 정의
    //인스턴스 멤버 필드 : 인스턴스를 만들어야만 접근 가능
    String title;

    //정적 멤버 필드 : 인스턴스간에 공유할 속성 정의
    //정적 멤버 필드 : 인스턴스를 만들지 않아도 접근 가능 (class. 으로 접근)
    static int bookId;

    public Book() {
        super();
    }

    public Book(String title) {
        this.title = title;
    }


    //멤버 메소드

    //인스턴스 멤버 메소드
    //인스턴스 멤버 메소드 바디에는 인스턴스 멤버, 정적 멤버 모두 사용 가능

    public String getTitle() {
        return title;
    }

    //정적 멤버 메소드
    //정적 멤버 메소드 바디에는 정적 멤버만 사용 가능 (인스턴트 멤버 X)

    public int getBookId() {    //인스턴스 메소드
        return bookId;          //정적 필드
    }
    //인스턴스 메소드 안에는 정적 멤버를 쓸 수 있다.
    //즉, 인스턴스 메소드 안에는 인스턴스 멤버와 정적 멤버 둘 다 올 수 있다.

    /*
    public static String getBookId2() { //정적 메소드
        return title;                   //인스턴스 필드
    }
    */
    //정적 메소드 안에는 인스턴스 멤버를 쓸 수 없다. (생성순서 문제)
    //즉, 정적 메소드 안에는 정적 멤버만 올 수 있다.
}
