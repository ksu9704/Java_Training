package part3.TestStudy;

import model.VO.StudentVO;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVO st1;
        StudentVO st2;
        StudentVO st3;

        st1 = new StudentVO("공상욱", "의용공학", 27, "ksu@naver.com", 19970419, "010-2222-3333");
        st2 = new StudentVO("공상욱", "의용공", 27, "ksu04@naver.com", 19970419, "010-4444-5555");
        st3 = new StudentVO("공상욱", "의용", 27, "ksu19@naver.com", 19970419, "010-6666-7777");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }

}
