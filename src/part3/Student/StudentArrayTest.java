package part3.Student;

import model.VO.StudentVO;

public class StudentArrayTest {
    public static void main(String[] args) {
        // Q. 객체배열을 이용하여 4명의 학샹 데이터를 저장하고 출력하세요.
        StudentVO[] studentVO = new StudentVO[4];

        studentVO[0] = new StudentVO("공상욱", "의용공학과", 27,"ksu9704@naver.com", 19970419,"010-42289745");
        studentVO[1] = new StudentVO("공욱", "의용공학", 26,"ksu9704@naver.com", 19970419,"010-42289745");
        studentVO[2] = new StudentVO("공상", "의용공", 25,"ksu9704@naver.com", 19970419,"010-42289745");
        studentVO[3] = new StudentVO("공", "의용", 24,"ksu9704@naver.com", 19970419,"010-42289745");

        for (int i=0; i< studentVO.length; i++){
            System.out.println(studentVO[i].toString());
        }
        for (StudentVO studentVO1 : studentVO){
            System.out.println(studentVO1.toString());
        }
    }
}
