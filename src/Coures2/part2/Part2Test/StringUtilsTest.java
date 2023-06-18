package Coures2.part2.Part2Test;

import Coures2.model2.Math.Converter;
import Coures2.model2.Math.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();
        Converter<String,String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println("result : " + result);
    }
}
