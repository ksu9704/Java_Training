package JavaStudy.model.DAO;

import JavaStudy.model.DTO.CarDTO;

public class CarDAO {
    // C.R.U.D
    // C = Create
    // R = Read
    // U = Update
    // D = Delete

    public void carInsert(CarDTO carDTO){
        // DB 연결, Insert SQL
        System.out.println("car 정보가 DB에 저장이 되었습니다.");
    }

    public void carSelect(CarDTO carDTO){
        // DB 연결, Insert SQL
        System.out.println("car 정보가 DB에 출력이 되었습니다.");
    }

    public void carUpdate(CarDTO carDTO){
        // DB 연결, Insert SQL
        System.out.println("car 정보가 DB에 Update 되었습니다.");
    }

    public void carDelete(CarDTO carDTO){
        // DB 연결, Insert SQL
        System.out.println("car 정보가 DB에 삭제 되었습니다.");
    }
}
