import java.util.Scanner;

public class HackJum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("<< 3개의 과목을 입력 받아 총점/평균 구하는 프로그램 >>");
        System.out.print("국어 점수 >> ");
        String input1 = scanner.nextLine();
        int kor = Integer.parseInt(input1); //국어점수

        System.out.print("영어 점수 >> ");
        String input2 = scanner.nextLine();
        int eng = Integer.parseInt(input2); //영어점수

        System.out.print("수학 점수 >> ");
        String input3 = scanner.nextLine();
        int math = Integer.parseInt(input3); //수학점수

        int sum = 0; //총점
        double average = 0.0; //평균

        sum = total(kor, eng, math);
        average = getAverage(sum, 3);

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);

    }

    //3과목의 합계
    public static int total(int kor, int eng, int math) {
//        return kor + eng + math;
        int result = kor + eng + math;
        return result;
    }

    //평균 구하기
    public static double getAverage(int total, int count) {
        return total / (double) count;
    }
}


/*
    my practice:

import java.util.Scanner;

public class HackJum3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("과목별 점수를 입력하여 평균과 총점을 구하시오.");


        int sum = 0;
        double avg = 0.0;

        System.out.print("국어 점수: ");
        int kor = Integer.parseInt(scanner.nextLine());
        System.out.print("영어 점수: ");
        int eng = Integer.parseInt(scanner.nextLine());
        System.out.print("수학 점수: ");
        int math = Integer.parseInt(scanner.nextLine());

        sum = sumMethod(kor, eng, math);
        avg = avgMethod(sum, 3);

        System.out.println("총점: " + sum + "점");
        System.out.println("평균: " + avg + "점");
    }

    public static int sumMethod(int kor, int eng, int math) {
        int result = kor + eng + math;
        return result;
    }

    public static double avgMethod(int sumMethod, int count) {
        return sumMethod / (double) count;
    }
}
*/