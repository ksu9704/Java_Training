package JavaStudy.part4.IsNotOverrideTest;

public class IsNotOverride {
    public static void main(String[] args) {

        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();

    }
}
