package Coures2.part1;

import Coures2.model2.DataBase.MSSQLDriver;
import Coures2.model2.DataBase.MySQLDriver;
import Coures2.model2.DataBase.OracleDriver;
import Coures2.model2.Interface.Connection;

public class DataBaseConnection {
    public static void main(String[] args) {
        Connection conn = new OracleDriver();
        conn.getConnection("jdbc:mysql://localhost:3306/DBNAME","system","manager");

        conn = new MySQLDriver();
        conn.getConnection("dbc:oracle:thin:@localhost:1521:DBNAME","root","1234");

        conn = new MSSQLDriver();
        conn.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=DBNAME", "sa", "1223");
    }
}
