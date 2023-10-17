package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String USER = "postgres";
    private static final String PASS = "Black_3737!?";
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";

    public static Connection connect(){
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
