package JavaStudy.part2.LoopLoop;

public class LoopLoopTest {
    public static void main(String[] args) {

        // Q. 이중 반복문을 이용하여 아래와 같은 구구단(9X9) 을 출력하세요.(LoopLoopTest.java)

        for (int i = 2; i<=9; i++){
            for (int j = 1; j<=9; j++){
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
    }
}
