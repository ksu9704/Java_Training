package JavaStudy.part2.IfBasic;

public class IfElseIfTest {
    public static void main(String[] args) {

        // Q. 80점 이상의 학생 중에서 90점 이상은 A반, 85점 이상은 B반,
        //    그렇지 않으면 C반으로 편성하고 점수가 80미만이면 불합격 처리하는 프로그램을 작성하세요.
        // 단, 점수는 0 ~ 100점 사이값을 받는다.

        int jumsu = 80;
        if (jumsu>=0 && jumsu<=100){

            if (jumsu >= 80) {
                if (jumsu >= 90) {
                    System.out.print("A반");
                } else if (jumsu >= 85) {
                    System.out.print("B반");
                } else if (jumsu >= 80) {
                    System.out.print("C반");
                } else {
                    System.out.print("불합격");
                }
            }else {
                System.out.println("학생의 점수는 80점 이상이 아닙니다.");
            }
        }else {
            System.out.println("유효한 점수가 아닙니다.");
        }
    }
}