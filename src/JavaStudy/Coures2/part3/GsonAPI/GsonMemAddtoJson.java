package JavaStudy.Coures2.part3.GsonAPI;

import JavaStudy.Coures2.model3.GsonTest.Address;
import JavaStudy.Coures2.model3.GsonTest.Person;
import com.google.gson.Gson;

public class GsonMemAddtoJson {
    public static void main(String[] args) {

        Address address = new Address("서울", "대한민국");
        Person person = new Person("공상욱", 27, "ksu@naver.com", address);

        // Person -> JSON
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
