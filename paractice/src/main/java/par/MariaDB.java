package par;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaDB {
    public static void main(String[] args) {
        //1.데이터 베이스 드라이버 로드
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 연결 성공");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        //2. 데이터베이스 접속
        try (Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306", "root", "yks700687@")) {
            System.out.println(con);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }}
