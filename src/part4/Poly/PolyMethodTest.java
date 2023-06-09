package part4.Poly;

import part4.DogCatTest.Animal;
import part4.DogCatTest.Cat;
import part4.DogCatTest.Dog;

public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    private static void display(Animal ani) { // 1. 다형성인수
        ani.eat();

        if (ani instanceof Cat){
        ((Cat)ani).night();
        }
    }

//    private static void display(Dog d) {
//        d.eat();
//    }
//
//    private static void display(Cat c) {
//        c.eat();
//    }

}
