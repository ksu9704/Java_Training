package JavaCodingTest.Ch01_문자열.대소문자바꾸기;

import java.util.Scanner;

    /* 입력
        첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100자 이다.
        WrongAnswer */

    /*출력
    첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
     wRONGaNSWER */

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= ans[i] && ans[i] <= 'z')
                ans[i] = (char) ('A' + ans[i] - 'a');
            else ans[i] = (char) ('a' + ans[i] - 'A');
        }
        System.out.println(ans);
    }
}
