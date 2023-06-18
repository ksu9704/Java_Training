package Coures2.part2.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //스트림의각원소를제곱한값으로구성된새로운리스트생성
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("제곱한 값의 리스트:" + squaredNumbers);
    }
}

