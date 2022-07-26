public class HackJum2 {
    public static void main(String[] args) {
        int kor = 82; //국어점수
        int eng = 73; //영어점수
        int math = 65; //수학점수

        int sum = 0; //총점
        double average = 0.0; //평균

        sum = total(kor, eng, math);
        average = getAverage(sum, 3);

        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);

        System.out.println(total(1, 2, 3));
        System.out.println(getAverage(100, 10));
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

     public static void main(String[] args) {

        sum();
        average();

    }

    public static void sum() {
        int k = 100;
        int e = 90;
        int m = 80;
        System.out.println("총점: " + (k + e + m) + "점");
    }

    public static void average() {
        double k = 100;
        double e = 90;
        double m = 81;
        System.out.println("평균: " + ((k + e + m) / 3) + "점");
    }
*/
