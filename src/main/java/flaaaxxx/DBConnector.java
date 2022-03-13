package flaaaxxx;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {

    private final static String DBURL = "jdbc:mysql://127.0.0.1:3306/login";
    private final static String DBUSER = "root";
    private final static String DBPASS = "";

    public static Connection connect() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            System.out.println("Success connect");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;

    }
}
