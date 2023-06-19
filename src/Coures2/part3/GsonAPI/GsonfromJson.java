package Coures2.part3.GsonAPI;

import Coures2.model3.GsonTest.Member;
import com.google.gson.Gson;

public class GsonfromJson {
    public static void main(String[] args) {

        String json = "{\"name\":\"공상욱\",\"age\":30,\"email\":\"ksu@naver.com\"}";

        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
        System.out.println(mvo); // mvo.toString()


    }
}
