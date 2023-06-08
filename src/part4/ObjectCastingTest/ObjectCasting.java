package part4.ObjectCastingTest;

import part4.DogCatTest.Animal;
import part4.DogCatTest.Cat;
import part4.DogCatTest.Dog;

public class ObjectCasting {
    public static void main(String[] args) {

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

//        Cat c = (Cat)ani;
//        c.night();
        ((Cat)ani).night();

    }
}
