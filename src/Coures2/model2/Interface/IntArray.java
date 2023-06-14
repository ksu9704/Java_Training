package Coures2.model2.Interface;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY = 5; // 수정불가(final) => 상수
    private int[] elements;
    private int size = 0;

    // 생성동작
    public IntArray(){
        elements = new int[DEFAULT_CAPACITY]; // 5개 크기배열
    }

    // 저장하는 동작
    public void add(int element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 얻는동작
    public int get(int index){
        return elements[index];
    }

    // 원소릐 개수를 넘겨주는 동작
    public int size(){
        return size;
    }

    public void ensureCapacity(){
        int newCapacity = elements.length*2;
       elements = Arrays.copyOf(elements, newCapacity);
    }
}
