package JavaStudy.Coures2.part1.Gson;

import JavaStudy.Coures2.model2.Math.Person;
import com.google.gson.Gson;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";
        Gson gson = new Gson();
       Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
