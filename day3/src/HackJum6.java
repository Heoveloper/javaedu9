import java.util.Scanner;

public class HackJum6 {
    public static void main(String[] args) {

        System.out.println(" << 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

        boolean stop = false;

        while(!stop) {
            int kor  = inputValue("국어"); //국어점수
            int eng  = inputValue("영어"); //영어점수
            int math = inputValue("수학"); //수학어점수

            int sum = 0;  //총점
            double average = 0.0; //평균

            sum = total(kor, eng, math);
            average = getAverage(sum, 3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);
        }
    }

    public static int inputValue(String title) {
        System.out.print(title + " 점수 >> ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        if(input.equals("Q") || input.equals("q")) {
            System.out.println("종료");
            System.exit(1);
        }

        int score = Integer.parseInt(input);
        return score;
    }

    public static int total(int korean, int english, int math) {
        return korean + english + math;
    }

    public static double getAverage(int total, int count) {
        return total / (double) count;
    }
}
