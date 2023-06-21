package JavaStudy.part3.Static;

import JavaStudy.model.Utility.MyUtility;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtility
        int sum = MyUtility.hap(a,b);
        System.out.println(sum);
    }
}
