package JavaCodingTest.Lv_0.문자리스트를문자열로변환하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[sc.nextInt()];
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

    }
}
