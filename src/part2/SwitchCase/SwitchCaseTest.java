package part2.SwitchCase;

public class SwitchCaseTest {
    public static void main(String[] args) {

        // Q. switch ~ case 문을 활용하여 요일에 해당하는 운동을 출력하세요.(SwitchCaseTest.java)

        String day = "Wednesday";

        switch (day) {
            case "Sunday":
                System.out.println("야구");
                break;
            case "Monday":
                System.out.println("농구");
                break;
            case "Tuesday":
            case "Wednesday":
                System.out.println("수영");
                break;
            default:
                System.out.println("휴식");
                break;
        }
    }
}