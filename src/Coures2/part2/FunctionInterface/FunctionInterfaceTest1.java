package Coures2.part2.FunctionInterface;

import Coures2.model2.DataBase.MathOperation;
import Coures2.model2.DataBase.MathOperationImpl;

public class FunctionInterfaceTest1 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10, 20);
        System.out.println("result : " + result);
    }
}