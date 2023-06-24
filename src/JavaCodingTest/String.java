package JavaCodingTest;

import java.util.Scanner;

class String {

    /* 입력
    첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100자 이다.
    WrongAnswer */

    /*출력
    첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
     wRONGaNSWER */

    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.lang.String str = scanner.next();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z')
                System.out.print((char) ('a' + ch - 'A'));
            else System.out.print((char) ('A' + ch - 'a'));
        }
    }
}
