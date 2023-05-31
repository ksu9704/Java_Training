package part2.IfBasic;

import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {

        // Q. 정수 1개를 입력 받아 입력된 수가 7의 배수인지를 출력하세요.(IfbasicTest.java)

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num%7 == 0){
            System.out.println( num + " = 7의 배수입니다.");
        }
        System.out.println("종료");

        // Q. 나이를 입력 받아 19세 이상이면 성인임을 출력하는 코드를 작성하세요 .

        int age = scan.nextInt();

        if (age >= 19){
            System.out.println("성인 입니다.");
        }
        System.out.println("종료");
    }
}
