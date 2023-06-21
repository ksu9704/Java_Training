package JavaStudy.Coures2.part1.Array;

import JavaStudy.Coures2.model2.ModelBook.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // Book 3권을 배열에 저장하고 출력하세요.
        // Book[], Object[]
        List list = new ArrayList();
        list.add(new Book("Java", 15000, "한빛", "공길동"));
        list.add(new Book("C++", 13000, "대림", "공길이"));
        list.add(new Book("Python", 17000, "정보", "공동길"));

       Book vo = (Book) list.get(0);
       System.out.println(vo.toString());

        vo = (Book) list.get(1);
        System.out.println(vo.toString());

        vo = (Book) list.get(2);
        System.out.println(vo.toString());

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i)); // Object -> Book(JVM에서 자동으로 Book의 toStrin()
        }

    }
}
