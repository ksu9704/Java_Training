package part3;

import model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Q. 생성자 메서드를 통해 PersonVO객체에 원하는 이름, 나이, 전화번호를 저장하고 출력하세요.

        PersonVO vo = new PersonVO("공상웅",28,"060-1234-5678");
        PersonVO vo1 = new PersonVO("공상욱",27,"010-4228-9999");
        PersonVO vo2 = new PersonVO("공길동",26,"010-4228-7777");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
        System.out.println(vo1.getName() + "\t" + vo1.getAge() + "\t" + vo1.getPhone());
        System.out.println(vo2.getName() + "\t" + vo2.getAge() + "\t" + vo2.getPhone());

    }
}
