package JavaCodingTest.배열두배만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] numbers = new int[a];
        int[] answer = new int[a];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }
        System.out.println(answer);

    }
}
