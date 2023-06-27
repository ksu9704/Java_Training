package JavaCodingTest.Ch01_문자열.문자열의앞의n글자;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        answer=my_string.substring(0,n);

        return answer;
    }
}