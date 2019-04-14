/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.QuanLyXe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tam Fat
 */
public class QuanLyXeDAO {
      
 public List<QuanLyXe> selectQuanLyXe() {
        String sql = " select CH.MaSoCanHo , TT.TenKhachHang , GX.SoLuongXeDap , GX.SoLuongXeMay , GX.SoLuongXeHoi, GX.TongTienGui "
                + "from CanHo CH join ThongTinKhachHang TT on CH.KhachHangId = TT.KhachHangId Join GuiXe GX on GX.CanHoId = CH.CanHoId";
        return select(sql);
    }

    private List<QuanLyXe> select(String sql, Object... args) {
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

    private QuanLyXe readFromResultSet(ResultSet rs) throws SQLException {
        QuanLyXe model = new QuanLyXe();
        model.setMaSoCanHo(rs.getString(1));
        model.setTenKhachHang(rs.getString(2));
        model.setSoLuongXeDap(rs.getInt(3));
        model.setSoLuongXeMay(rs.getInt(4));
        model.setSoLuongXeHoi(rs.getInt(5));
        model.setTongTienGui(rs.getFloat(6));
     return model;     
    }
}
