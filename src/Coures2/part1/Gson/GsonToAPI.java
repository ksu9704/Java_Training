package Coures2.part1.Gson;

import Coures2.model2.Math.Person;
import com.google.gson.Gson;

public class GsonToAPI {
    public static void main(String[] args) {
        Person person = new Person("John", 30);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
