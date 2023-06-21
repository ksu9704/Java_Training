package JavaStudy.part4.IsNotOverrideTest;

public class AbstractClassTest {
    public static void main(String[] args) {
        // 추상클래스는 단독으로 객체를 새성할수없다.
//        Animal ani = new Animal();
//        ani.eat();

        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
