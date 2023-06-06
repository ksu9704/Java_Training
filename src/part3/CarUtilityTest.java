package part3;

import model.DTO.CarDTO;
import model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {

        // Q. Car 정보를 출력하는 동작을 가지고있는 Utility 클래스를 설계하세요.
        int carSn = 1110;
        int carPrice = 900000;
        String carName = "BMW";
        int carYear = 1997;
        String carType = "G";

        // 데이터를 하나로 묶는다.
        CarDTO carDTO = new CarDTO();
        carDTO.carSn = carSn;
        carDTO.carName = carName;
        carDTO.carPrice = carPrice;
        carDTO.carYear = carYear;
        carDTO.carType = carType;
//        carPtrint(carDTO);
        CarUtility carUtility = new CarUtility();
        carUtility.carPtrint(carDTO);
    }

    // 매개변수로 자동차의 정보를 입력받아서 출력하는 메서드를 정의하세요.
//    public static void carPtrint(CarDTO carDTO) {
//        System.out.println(carDTO.carSn + "\t" + carDTO.carName + "\t" + carDTO.carPrice + "\t" + carDTO.carYear + "\t" + carDTO.carType);
//    }
}
