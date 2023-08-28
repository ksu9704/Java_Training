package JavaCodingTest.Lv_0.공배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();


        if (number % n == 0){
            if ( number % m == 0){
                answer = 1;
                System.out.println(answer);
            }
            answer = 0;
            System.out.println(answer);

        }
    }
}
