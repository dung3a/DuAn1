/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.UI.QuanLyXe;
import duan.model.LoaiXe;
import duan.model.ThongTinKhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tam Fat
 */
public class QuanLyXeDAO {
/* public List<QuanLyXe> selectQuanLyXe() {
        String sql = " SELECT TT.KhachHangId,CH.MaSoCanHo,TT.TenKhachHang,TT.CMND,TT.GioiTinh,TT.SoDT,TT.Email,TT.TrangThai,TT.ChuHo FROM dbo.ThongTinKhachHang TT JOIN dbo.CanHo CH ON CH.CanHoId = TT.CanHoId ";
        return select(sql);
    }

    private List<QuanLyXe> select(String sql) {
        List<QuanLyXe> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    QuanLyXe model = readFromResultSet(rs);
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
        QuanLyXe model = new QuanLyXe();
        model.setMaSoCanHo(rs.getString(1));
        model.setCanHoid(rs.getString(2));
        model.setTenKhachHang(rs.getString(3));
        model.setCMND(rs.getString(4));
        model.setGioiTinh(rs.getBoolean(5));
        model.setSodt(rs.getString(6));
        model.setEmail(rs.getString(7));
        model.setTrangThai(rs.getString(8));
        model.setChuHo(rs.getBoolean(9));
        return model;
    }*/
}
