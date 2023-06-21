package JavaStudy.Coures2.part2.Integer;

import JavaStudy.Coures2.model2.Math.Converter;
import JavaStudy.Coures2.model2.Math.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        //정적메서드 참조
        Converter<String,Integer> converter = IntegerUtils::stringToInt;
        int result =  converter.convert("123");
        System.out.println("result : " + result);
    }
}
