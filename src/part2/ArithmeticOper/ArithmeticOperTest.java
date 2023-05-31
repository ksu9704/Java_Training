package part2.ArithmeticOper;

public class ArithmeticOperTest {
    public static void main(String[] age){

        // Q. 나누기와 나머지 연산자의 활용(정수의 자릿수 구하기)(ArithmeticOperTest.java)
        int digit = 3625;
        System.out.println(digit%10);
        System.out.println(digit/10%10);
        System.out.println(digit/100%10);
        System.out.println(digit/1000%10);

        int num = 2579;
        int a = num%10;
        int b = num/10%10;
        int c = num/100%10;
        int d = num/1000%10;

        int e = a+b+c+d;
        System.out.print(e);

    }
}
