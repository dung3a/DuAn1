/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.ThongTinKhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class ThongTinKhachHangDAO {
    
    
     public List<ThongTinKhachHang> select(String canhoID ){ 
        String sql = "SELECT * FROM dbo.ThongTinKhachHang WHERE CanHoId = ?";
        return select(sql , canhoID);
    }
    
     public ThongTinKhachHang selectById(String MaKH){
        String sql = "SELECT * FROM dbo.ThongTinKhachHang WHERE KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql,MaKH);
        return list.size() > 0 ? list.get(0) : null; 
    }
     
    private List<ThongTinKhachHang> select(String sql, Object... args) {
        List<ThongTinKhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    ThongTinKhachHang model = readFromResultSet(rs);
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

    private ThongTinKhachHang readFromResultSet(ResultSet rs) throws SQLException {
        ThongTinKhachHang model = new ThongTinKhachHang();
        model.setKhachHangid(rs.getString("KhachHangId"));
        model.setCanHoid(rs.getString("CanHoId"));
        model.setTenKhachHang(rs.getString("TenKhachHang"));
        model.setCMND(rs.getString("CMND"));
        model.setGioiTinh(rs.getBoolean("GioiTinh"));
        model.setSodt(rs.getString("SoDT"));
        model.setEmail(rs.getString("Email"));
        model.setChuHo(rs.getBoolean("ChuHo"));
        return model;
    }
}
