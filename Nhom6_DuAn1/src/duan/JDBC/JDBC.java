/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author anhdu
 */
public class JDBC {
    //Hàm kết nối với SQL Sever và database trong sql

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databasename=DuAn1;username=sa;password=123";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {           //thông báo lỗi ngoại lệ
            throw new RuntimeException(ex);
        }
    }


    public static PreparedStatement preparedStatement(String sql, Object... args) throws SQLException {
        Connection connection = DriverManager.getConnection(dburl);
        PreparedStatement pstmt = null;
        if (sql.trim().startsWith("{")) {
            pstmt = connection.prepareCall(sql);

        } else {
            pstmt = connection.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstmt.setObject(i + 1, args[i]);

        }
        return pstmt;
    }

    
    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement stmt = preparedStatement(sql, args);
            try {
                stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
// select tra ve gia tri

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement stmt = preparedStatement(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

}
