package part2.ForLoop;

public class ForLoopTest {
    public static void main(String[] args) {

        // 1 Q. 반복문을 이용하여 알파벳 대문자와 아스키 코드 값을 출력하세요.(ForLoopTest.java)

        for (char c = 'A'; c<='Z'; c++){
            System.out.println("c = " + c + "|" + (int)c);
        }


        // 2 Q. int[ ] numbers={ 1,2,3,4,5,6,7,8,9,10}; 배열 원소를 향상된 for문으로 출력하세요.

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i<numbers.length; i++){
            System.out.println("numbers = " + numbers[i]);
        }

        for (int su : numbers){
            System.out.println(su);
        }


    }
}
