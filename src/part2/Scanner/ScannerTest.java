package part2.Scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수를 입력하세요.");
        int num = scan.nextInt(); // 블럭상태
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요.");
        float f = scan.nextFloat(); // 블럭상태
        System.out.println("f = " + f);

        System.out.println("문자열 입력하세요.");
        String str = scan.next(); // 블럭상태
        System.out.println("str = " + str);

        scan.nextLine(); // 버퍼 비우기

        System.out.println("문자열 입력하세요.");
        String str1 = scan.nextLine(); // 블럭상태
        System.out.println("str1 = " + str1);

    }
}
