package JavaCodingTest;

import java.io.File;
import java.util.Scanner;

class String {

    /* 입력
    첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100자 이다.*/

    /*출력
    첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.*/

    public static void main(java.lang.String[] args) {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(file);
        java.lang.String str = scanner.next();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z')
                System.out.print((char) ('a' + ch - 'A'));
            else System.out.println((char) ('A' + ch - 'a'));
        }
    }
}
