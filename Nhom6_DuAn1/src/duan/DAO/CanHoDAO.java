/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.CanHo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class CanHoDAO {


    public List<CanHo> select(String masocanho ){ 
        String sql = "SELECT * FROM dbo.CanHo WHERE MaSoCanHo LIKE  ? ";
        return select(sql , "%"+masocanho+"%");
    }
     public List<CanHo> selectbyTang(String Tang ){ 
        String sql = "SELECT * FROM dbo.CanHo WHERE Tang =  ? ";
        return select(sql , Tang);
    }
  
    private List<CanHo> select(String sql, Object... args) {
        List<CanHo> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    CanHo model = readFromResultSet(rs);
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

    private CanHo readFromResultSet(ResultSet rs) throws SQLException {
        CanHo model = new CanHo();
        model.setCanHoid(rs.getString(1));
        model.setMaSoCanHo(rs.getString(2));
        model.setKhachHangid(rs.getString(3));
        model.setTang(rs.getByte(4));
        model.setTinhTrang(rs.getBoolean(5));
        return model;
    }
}
