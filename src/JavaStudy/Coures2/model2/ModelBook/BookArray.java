package JavaStudy.Coures2.model2.ModelBook;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY = 5; // 수정불가(final) => 상수
    private Book[] elements;
    private int size = 0;

    // 생성동작
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY]; // 5개 크기배열
    }

    // 저장하는 동작
    public void add(Book element){
        if (size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // 얻는동작
    public Book get(int index){
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위(0~4) 초과");
        }
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
