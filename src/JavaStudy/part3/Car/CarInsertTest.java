package JavaStudy.part3.Car;

import JavaStudy.model.DAO.CarDAO;
import JavaStudy.model.DTO.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // Q. 자동차 정보를 키보드로 입력을 받아서 DB에 저장을 하세요(JDBC)

        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호 : ");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름 : ");
        String carName = scan.nextLine();

        System.out.print("자동차 가격 : ");
        int carPrice = scan.nextInt();

        System.out.print("자동차 년식 : ");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입 : ");
        String carType = scan.nextLine();

        CarDTO carDTO = new CarDTO();
        carDTO.carSn = carSn;
        carDTO.carName = carName;
        carDTO.carPrice = carPrice;
        carDTO.carYear = carYear;
        carDTO.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(carDTO);
        dao.carSelect(carDTO);
    }
}

