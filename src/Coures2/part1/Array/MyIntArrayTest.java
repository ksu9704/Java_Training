package Coures2.part1.Array;

import Coures2.model2.Interface.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        // 정수 3개를 배열에 저장하고 출력하세요 => []
        IntArray list = new IntArray();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
