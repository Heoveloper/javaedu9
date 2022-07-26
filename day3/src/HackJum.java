public class HackJum {
    public static void main(String[] args) {
        int kor = 85; //국어점수
        int eng = 75; //영어점수
        int math = 63; //수학점수

        int sum = 0; //총점
        double average = 0.0; //평균

        sum = kor + eng + math;
        //case1)
        //average = (double)sum / 3;
        //case2)
        //average = sum / (double)3;
        //case3)
        average = sum / (3 * 1.0);
        System.out.println("총점: " + sum);
        System.out.println("평균: " + average);
    }
}

/*
       my practice:

       public static void main(String[] args) {
        double k = 100;
        double e = 100;
        double m = 95.5;
        double sum = k + e + m;
        double average = (k + e + m) / 3;

        System.out.println("총점: " + sum);
        System.out.print("평균: ");
        System.out.printf("%5.2f\n", average);
    }
*/
