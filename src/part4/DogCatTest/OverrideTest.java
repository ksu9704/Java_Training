package part4.DogCatTest;

public class OverrideTest {
    public static void main(String[] args) {

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
