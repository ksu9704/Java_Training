package Coures2.part3.GsonAPI;

import Coures2.model3.GsonTest.Member;
import com.google.gson.Gson;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("공상욱",30,"ksu@naver.com");

        Gson gson = new Gson();
        String json = gson.toJson(mvo);
        System.out.println(json);
    }
}
