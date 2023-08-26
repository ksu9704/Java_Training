package JavaCodingTest.공배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answerA = number % n;
        int answerB = number % m;

        if (answerA == answerB){
            answer = 1;
            System.out.println(answer);
        }

        if (answerA != answerB){
            answer = 0;
            System.out.println(answer);
        }
    }
}
