/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class UserDAO {

    public void updateUser(Users model) {
        String sql = "UPDATE dbo.Users SET Ten = ?,Email = ?, SoDT = ? WHERE UserId = ?";
        JDBC.executeUpdate(sql,
                model.getTen(),
                model.getEmail(),
                model.getSdt(),
                model.getUserid());

    }

    public void updatePass(Users model) {
        String sql = "UPDATE dbo.Users SET Pass = ? WHERE UserId =  ?";
        JDBC.executeUpdate(sql,
                model.getPass(),
                model.getUserid());

    }

  
    
      public Users select(){
        String sql = "SELECT * FROM dbo.Users ";
        List<Users> list = select(sql);
        return list.size() > 0 ? list.get(0) : null; 
    }
    
    private List<Users> select(String sql, Object... args) {
        List<Users> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    Users model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private Users readFromResultSet(ResultSet rs) throws SQLException {
        Users model = new Users();
        model.setUserid(rs.getString("UserId"));
        model.setPass(rs.getString("Pass"));
        model.setTen(rs.getString("Ten"));
        model.setEmail(rs.getString("Email"));
        model.setSdt(rs.getString("SoDT"));
        return model;
    }
}
