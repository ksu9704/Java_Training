package Coures2.part2;

import Coures2.model2.Person;
import Coures2.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {

//        PersonFactory personFactory = Person::new;
//        Person person = personFactory.create("공상욱", 27);
//        System.out.println(person);

        //익명내부 클래스
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };
        Person person = personFactory.create("공길동",27);
        System.out.println(person);
    }
}
