package Coures2.part1.APITest;

import Coures2.model2.BB;
import Coures2.model2.Interface.CC;

// CC를 이용하여 BB를 동작시키는 프로그래밍(인터페이스 기반의 프로그래밍)
public class IntefaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x();
        c.y();
        c.z();
    }
}
