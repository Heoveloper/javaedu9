/*
    배열: 하나의 변수로 여러 개의 값을 메모리 연속공간에 저장할 수 있는 자료구조
    배열요소: 배열에 저장된 값 하나하나를 뜻한다.
    배열요소 접근방법: 배열변수이름[인덱스]

    배열선언:   int[] 변수이름; or int 변수이름[];
    배열생성:   변수이름 = new int[요소의 크기];
    (ex 국, 영, 수 3과목을 저장하겠다: 변수이름 = new int[3];)
*/
public class ArrayTest1 {
    public static void main(String[] args) {

//        int[] subject; //배열 선언
//        subject = new int[3]; //배열 생성 //int: 0으로 초기화된다.
        int[] subject = new int[3];
//        int subject[] = new int[3];

        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);

        double[] subject2; //배열 선언
        subject2 = new double[3]; // double: 0.0으로 초기화된다.

        System.out.println(subject2[0]);
        System.out.println(subject2[1]);
        System.out.println(subject2[2]);

        boolean[] subject3; //배열 선언
        subject3 = new boolean[3]; // boolean: false로 초기화된다.

        System.out.println(subject3[0]);
        System.out.println(subject3[1]);
        System.out.println(subject3[2]);

        char[] subject4; //배열 선언
        subject4 = new char[3]; // char: 공백문자(' ')로 초기화된다.

        System.out.println(subject4[0]);
        System.out.println(subject4[1]);
        System.out.println(subject4[2]);

        String[] subject5; //배열 선언
        subject5 = new String[3]; // String: 참조타입은 null 값으로 초기화된다.

        System.out.println(subject5[0]);
        System.out.println(subject5[1]);
        System.out.println(subject5[2]);
    }
}
