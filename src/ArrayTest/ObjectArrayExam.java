package ArrayTest;

import Movie.Movie_;

public class ObjectArrayExam {
    public static void main(String[] args) {

        // Q. 영화3 편을 저장 할 [배열을 생성]하고 영화 3편의 테이터를 저장하고 출력하세요
        Movie_[] m = new Movie_[3];

        m[0] = new Movie_();
        m[0].mtitle = "A영화";
        m[0].mmajor = "공매일";
        m[0].mtime = 160;
        m[0].mlevel = 15;
        m[0].mday = "2023-05-23";

        m[1] = new Movie_();
        m[1].mtitle = "B영화";
        m[1].mmajor = "공매";
        m[1].mtime = 150;
        m[1].mlevel = 16;
        m[1].mday = "2023-05-23";

        m[2] = new Movie_();
        m[2].mtitle = "C영화";
        m[2].mmajor = "공일";
        m[2].mtime = 120;
        m[2].mlevel = 14;
        m[2].mday = "2023-05-23";

        // 반복문 사용

            for (int i = 0; i<m.length; i++){
                System.out.println(m[i].mtitle + "\t" + m[i].mmajor + "\t" + m[i].mtime + "\t" + m[i].mlevel + "\t" + m[i].mday  );
        }
    }
}
