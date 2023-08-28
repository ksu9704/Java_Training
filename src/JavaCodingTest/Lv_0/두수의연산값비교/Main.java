package JavaCodingTest.Lv_0.두수의연산값비교;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();

        String answerA = String.valueOf(a);
        String answerB = String.valueOf(b);

        int product = 2*a*b;

        answer = Integer.valueOf(answerA + answerB);

        if (product > answer){
            System.out.println(product);
        }

        if (answer > product){
            System.out.println(answer);
        }
    }
}
