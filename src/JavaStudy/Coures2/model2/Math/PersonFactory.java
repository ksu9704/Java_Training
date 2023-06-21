package JavaStudy.Coures2.model2.Math;
@FunctionalInterface
public interface PersonFactory {
    public Person create(String name, int age);
}
