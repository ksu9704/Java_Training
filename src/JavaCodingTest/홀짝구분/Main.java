package JavaCodingTest.홀짝구분;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        String answer = "";

        int my = my_string.length();
        int over = overwrite_string.length();

        String sub_st_01 = my_string.substring(0, s);
        String sub_st_02 = my_string.substring((s+over), my);


        System.out.println(answer + sub_st_01 + overwrite_string + sub_st_02);
    }
}