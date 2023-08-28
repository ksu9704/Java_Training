package JavaCodingTest.Lv_0.문자열곱하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String answer = "";
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        System.out.println(answer);
    }
}
