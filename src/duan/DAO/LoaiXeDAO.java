/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.LoaiXe;
import duan.model.Users;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class LoaiXeDAO {


//Update tien xe

    public void updateXeDap(float Tien) {
        String sql = "UPDATE dbo.LoaiXe SET GiaTrongCoi = ? WHERE LoaixeId = 'XD'";
        JDBC.executeUpdate(sql, Tien);
    }

    public void updateXeHoi(float Tien) {
        String sql = "UPDATE dbo.LoaiXe SET GiaTrongCoi = ? WHERE LoaixeId = 'XH'";
        JDBC.executeUpdate(sql, Tien);
    }

    public void updateXeMay(float Tien) {
        String sql = "UPDATE dbo.LoaiXe SET GiaTrongCoi = ? WHERE LoaixeId = 'XM'";
        JDBC.executeUpdate(sql, Tien);
    }
    public void updateDichVu(float Tien) {
        String sql = "UPDATE dbo.TienDichVuCoBan SET TienDichVuCoBan = ? WHERE TienDVCBId = 1";
        JDBC.executeUpdate(sql, Tien);
    }

    private List<LoaiXe> select(String sql, Object... args) {
        List<LoaiXe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    LoaiXe model = readFromResultSet(rs);
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

    private LoaiXe readFromResultSet(ResultSet rs) throws SQLException {
        LoaiXe model = new LoaiXe();
        model.setLoaiXeid(rs.getString(1));
        model.setLoai(rs.getString(2));
        model.setGiaTrongCoi(rs.getFloat(3));
        return model;
    }
}
