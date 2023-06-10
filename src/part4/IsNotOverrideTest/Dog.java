package part4.IsNotOverrideTest;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("개처럼먹는다");
    }

}
