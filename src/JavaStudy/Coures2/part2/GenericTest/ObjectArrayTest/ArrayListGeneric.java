package JavaStudy.Coures2.part2.GenericTest.ObjectArrayTest;

import JavaStudy.Coures2.model2.Math.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    public static void main(String[] args) {

        List<Movie> list = new ArrayList<>();

        list.add(new Movie("괴물", "봉준호", "2006", "한국"));
        list.add(new Movie("기생충", "봉준호", "2019", "한국"));

        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
