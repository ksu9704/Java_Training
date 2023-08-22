package JavaCodingTest.문자열돌리기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] str = a.split("");

        for (int i = 0; i < a.length(); i++) {
            System.out.println(str[i]);
        }
    }
}