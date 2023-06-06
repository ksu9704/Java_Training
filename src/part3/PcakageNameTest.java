package part3;

import model.DAO.CarDAO;
import model.DTO.CarDTO;

import java.util.Scanner;

public class PcakageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자?
        String str;
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World");

        // Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자?
        CarDTO carDTO = new CarDTO();
        CarDAO carDAO = new CarDAO();
    }
}
