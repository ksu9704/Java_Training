package part3.Student;

import model.VO.StudentVO;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생성하세요.
        int [] arr = new int[6];
        arr[0] = 10;
        arr[1] = 30;
        arr[2] = 67;
        arr[3] = 98;
        arr[4] = 55;
        arr[5] = 32;
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
       // Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        StudentVO studentVO = new StudentVO("공상욱", "의용공학과", 27,"ksu9704@naver.com", 19970419,"010-42289745");
        System.out.println(studentVO.toString());
    }
}
