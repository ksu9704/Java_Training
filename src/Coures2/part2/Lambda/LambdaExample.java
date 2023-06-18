package Coures2.part2.Lambda;

import Coures2.model2.DataBase.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
//        MathOperation add = new MathOperation() {
//            @Override
//            public int operation(int x, int y) {
//                return x+y;
//            }
//        };
        // 위 부분을 람다식으로 표현 한 것이 라래 코드

//        MathOperation add = (int x, int y) ->{return x+y;};
        // 더 간결한 코드는 아래쪽

        // 람다식 : 코드를 간결, 확장, 구현이 쉽다.
        MathOperation add = (x, y) -> x+y;
        MathOperation multi = (x, y) -> x*y;


        int result = add.operation(10,20);
        int mulresult = multi.operation(10,20);
        System.out.println("result : " + result);
        System.out.println("mulresult : " + mulresult);
    }
}
