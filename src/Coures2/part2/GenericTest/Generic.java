package Coures2.part2.GenericTest;

import Coures2.model2.Movie;
import Coures2.part2.GenericTest.ObjectArrayTest.ObjectArray;

public class Generic {
    public static void main(String[] args) {

//        ObjectArray<String> array = new ObjectArray<>(5);
//        array.set(0, "Hello");
//        array.set(1, "World");
//        array.set(2, "Java");
//        array.set(3, "Generic");
//        array.set(4, "Example");
//
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }

        ObjectArray<Movie>bList = new ObjectArray<>(5);
        bList.set(0, new Movie("괴물", "봉준호", "2006", "한국"));
        bList.set(1, new Movie("기생충", "봉준호", "2019", "한국"));
        bList.set(2, new Movie("완벽한 타인", "이재규", "2018", "한국"));

        for (int i=0; i< bList.size(); i++){
            System.out.println(bList.get(i));
        }
    }
}
