package JavaCodingTest.Lv_0.n의배수;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = 0;
        int num = sc.nextInt();
        int n = sc.nextInt();

        answer = num % n;

        if (answer == 0){
            System.out.println(1);
        }

        if (answer != 0){
            System.out.println(0);
        }
    }
}
