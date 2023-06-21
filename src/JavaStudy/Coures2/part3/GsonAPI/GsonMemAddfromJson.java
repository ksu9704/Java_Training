package JavaStudy.Coures2.part3.GsonAPI;

import JavaStudy.Coures2.model3.GsonTest.Person;
import com.google.gson.Gson;

public class GsonMemAddfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"공상욱\",\"age\":27,\"email\":\"ksu@naver.com\",\"address\":{\"city\":\"서울\",\"country\":\"대한민국\"}}";

        Gson gson = new Gson();
        Person member = gson.fromJson(json, Person.class);
        System.out.println(member);
    }
}
