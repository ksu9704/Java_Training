package part3.Car;

import model.DTO.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동 해야 되는 경우를 생각해보자

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

//        System.out.println(carSn + "\t" + carName + "\t" + carPrice + "\t" + carYear + "\t" + carType);
//        자동차 데이터를 이동하기 위한 바구니가 필요하다(DTO, VO)
//        클래스로 CarDTO, CarVO 모델을 설계?
//        carInPrint(carSn, carName, carPrice, carYear, carType);
        CarDTO carDTO = new CarDTO();
        carDTO.carSn = carSn;
        carDTO.carName = carName;
        carDTO.carPrice = carPrice;
        carDTO.carYear = carYear;
        carDTO.carType = carType;
        carInPrint(carDTO);
    }

    // Q. 매개변수로 자동차의 정보를 받아서 / 출력하는 / 메서드를 정의하세요.
//    public static void carInPrint(int carSn, String carName, int carPrice, int carYear, String carType){
//        System.out.println(carSn + "\t" + carName + "\t" + carPrice + "\t" + carYear + "\t" + carType);
//
//    }

    public static void carInPrint(CarDTO carDTO){
        System.out.println(carDTO.carSn + "\t" + carDTO.carName + "\t" + carDTO.carPrice + "\t" + carDTO.carYear + "\t" + carDTO.carType);

    }

}
