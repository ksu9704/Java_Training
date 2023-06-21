package JavaStudy.Coures2.part2.Part2Test;

public class WrapperTest {
    public static void main(String[] args) {
        // 정수형 변수에 10일 저장해라
        int a = 10;

        // Integer aa = new Integer(10); // 사용자정의 자료형
        Integer aa = 10;
        System.out.println(aa.intValue());

        Integer bb = 20;
        int b = bb;

        float f = 10.5f;
//        Float ff = new Float(10.5f);
        Float ff = 45.6f;
        System.out.println(ff.floatValue());

        Float af = 49.1f;
        System.out.println(af.floatValue());
        float aff = af;
        System.out.println(aff);

    }
}
