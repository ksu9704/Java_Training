package part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
        Person p = new Person();
        p.name = "공상욱";
        p.age = 27;
        p.phone = "010-4228-9999";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone);

    }
}
