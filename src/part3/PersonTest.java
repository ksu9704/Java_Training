package part3;

public class PersonTest {
    public static void main(String[] args) {

        // Q. 한사람의 데이터를 저장할 [변수를 선언]하세요.
        // Q. 모델링 된 Person클래스를 이용하여 객체를 메모리에 생성하세요.

        Person p = new Person();
        p.name = "공상욱";
        p.age = 27;
        p.phone = "010-4228-9999";
        System.out.println(p.name + "\t" + p.age + "\t" + p.phone );

        p.play();
        p.eat();
        p.walk();

        Person p1 = new Person();
        p1.name = "상욱";
        p1.age = 26;
        p1.phone = "010-4228-7777";
        System.out.println(p1.name + "\t" + p1.age + "\t" + p1.phone );

        p1.play();
        p1.eat();
        p1.walk();
    }
}
