package JavaStudy.Coures2.model2.DataBase;

import JavaStudy.Coures2.model2.Interface.Connection;

public class MSSQLDriver implements Connection {
    @Override
    public void getConnection(String url, String username, String password) {
        System.out.println("url, username, password 정보를 이용하여 MSSQLDriver DB를 접속 시도한다.");
    }
}
