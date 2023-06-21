package JavaStudy.part4.DogCatTest;

public class DogCat {
    public static void main(String[] args) {

       // Dog 객체를 생성하고 eat() 동작을 구동해보자.
        Dog d = new Dog();
        d.eat();

        // CAT 객체를 생성하고 eat(), night 동작을 구동해보자.
        Cat c = new Cat();
        c.eat();
        c.night();

    }
}
