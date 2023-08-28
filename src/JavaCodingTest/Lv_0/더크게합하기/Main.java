package JavaCodingTest.Lv_0.더크게합하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        String answerA = String.valueOf(a);
        String answerB = String.valueOf(b);
        answer = Integer.valueOf(answerA + answerB);
        int answer2 = Integer.valueOf(answerB + answerA);

        if (answer < answer2) {
            answer = answer2;
        }
        System.out.println(answer);
    }
}