package test;
import java.util.Scanner;

public class Main {
    public static int solution(int[][] numArr2, int num) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < num; i++) {
            int record = 0;
            int column = 0;
            diagonal1 += numArr2[i][i];
            diagonal2 += numArr2[i][num-1-i];
            for (int j = 0; j < num; j++) {
                   record += numArr2[i][j];
                   column += numArr2[j][i];
            }
            if(max < Math.max(record, column)) {
                max = Math.max(record, column);
            }
        }

        max = Math.max(max,diagonal1);
        max = Math.max(max,diagonal2);
        answer = max;

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] numArr2 = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                numArr2[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(numArr2, num));
    }
}

