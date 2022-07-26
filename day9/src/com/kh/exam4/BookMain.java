package com.kh.exam4;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book("제목1");
        Book b2 = new Book("제목2");
        Book b3 = new Book("제목3");
        Book b4 = new Book("제목4");
        Book b5 = new Book("제목5");
        Book b6 = new Book("제목6");
        Book b7 = new Book("제목7");
        Book b8 = new Book("제목8");
        Book b9 = new Book("제목9");
        Book b10 = new Book("제목10");

        System.out.println(b1.getBookId()); //1
        System.out.println(b2.getBookId()); //2
        System.out.println(b3.getBookId()); //3
        System.out.println(b4.getBookId()); //4
        System.out.println(b5.getBookId()); //5
        System.out.println(b6.getBookId()); //6
        System.out.println(b7.getBookId()); //7
        System.out.println(b8.getBookId()); //8
        System.out.println(b9.getBookId()); //9
        System.out.println(b10.getBookId()); //10

        //최근 bookId정보 출력하기
        System.out.println(Book.getCount());


        int a;

        a=0;
        while (a < 10) {
            System.out.println(a +"");
            a++;
        }
        System.out.println();
    }
}
