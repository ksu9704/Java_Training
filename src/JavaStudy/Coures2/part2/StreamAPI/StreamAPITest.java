package JavaStudy.Coures2.part2.StreamAPI;

import java.util.Arrays;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        /*int even = 0;
        for (int num : numbers){
            if (num%2==0){
                even+=num;
            }
        }*/

//        IntStream stream = Arrays.stream(numbers);

        int sumOfEvens = Arrays.stream(numbers)
                        .filter(n->n%2==0)
                                .sum();

        System.out.println("sumOfEvens = " + sumOfEvens);


        int[] evenNumbers = Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();

        for (int even : evenNumbers){
            System.out.println("even : " + even);
        }

    }
}
