package JavaStudy.part2.WhileLoop;

public class WhileLoopTest {
    public static void main(String[] args) {

        // 1 Q. int[ ] numbers={1,2,3,4,5,6,7,8,9,10} 주어진 배열의 모든 원소를 출력하세요.

        int[] numbers ={1,2,3,4,5,6,7,8,9,10};
        int i = 0;

        while(i<numbers.length){
            System.out.println("i = " + numbers[i]);
            i++;
        }
        System.out.println("index = " + i); // index 10


        // 2 Q. 1~10까지 출력하는 프로그램을 while과 do~while문으로 작성하세요.(WhileLoopTest.java)

        i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}

