package JavaStudy.part4.ObjectTest;

public class Object {
    public static void main(String[] args) {

        A a = new A();
        a.display();

        Object obj = new A();
        ((A)obj).display();

    }
}
