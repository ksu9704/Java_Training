package Coures2.part1.Book;

import Coures2.model2.ModelBook.Book;
import Coures2.model2.ModelBook.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("Java", 15000, "한빛", "공길동"));
        list.add(new Book("C++", 13000, "대림", "공길이"));
        list.add(new Book("Python", 17000, "정보", "공동길"));

//        Book vo = list.get(0);
        System.out.println(list.get(0));

//        vo = list.get(1);
        System.out.println(list.get(1));

//        vo = list.get(2);
        System.out.println(list.get(2));

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
