package JavaStudy.part4.DogCatTest;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        // Dog 객체를 사용해보자

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
