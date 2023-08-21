package JavaCodingTest.Ch01_문자열.각도기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angle = sc.nextInt();
        int answer = 0;

        if (angle > 0 && angle < 90) {
            answer = 1;
        }
        else if (angle == 90) {
            answer = 2;
        }
        else if(angle > 90 && angle < 180) {
            answer = 3;
        }
        else {
            answer = 4;
        }
        System.out.println(answer);

    }
}
