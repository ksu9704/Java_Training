package JavaStudy.part3.Static;

import JavaStudy.model.Utility.MyUtility_;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // MyUtility_
        MyUtility_ my_ = new MyUtility_();
        int sum = my_.hap(a,b);
        System.out.println(sum);
    }
}
