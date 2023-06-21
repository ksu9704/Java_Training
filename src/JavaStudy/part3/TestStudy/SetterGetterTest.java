package JavaStudy.part3.TestStudy;

import JavaStudy.model.VO.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. setter, getter 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonVO vo = new PersonVO();
        vo.setName("공상욱");
        vo.setAge(27);
        vo.setPhone("010 - 4228 - 9745");

        System.out.println(vo.getName() + "\t" + vo.getAge() + "\t" + vo.getPhone());
    }
}
