package Coures2.part2.FunctionInterface;

import Coures2.model2.DataBase.MathOperation;

public class FunctionInterfaceTest2 {

    public static void main(String[] args) {
        MathOperation mo = new MathOperation() {

            @Override
            public int operation(int x, int y) {
                return 0;
            }
        };

        int result = mo.operation(10,20);
        System.out.println("result : "+result);
    }
}
