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

    /*Thông Tin Căn Hộ*/
    public List<ThongTinKhachHang> selectByIdCH(String canhoID) {
        String sql = "  SELECT * FROM dbo.ThongTinKhachHang WHERE CanHoId = ?";
        return select(sql, canhoID);
    }

    public List<ThongTinKhachHang> listTTKH() {
        String sql = " SELECT TT.KhachHangId,CH.MaSoCanHo,TT.TenKhachHang,TT.CMND,TT.GioiTinh,TT.SoDT,TT.Email,TT.TrangThai,TT.ChuHo FROM dbo.ThongTinKhachHang TT JOIN dbo.CanHo CH ON CH.CanHoId = TT.CanHoId ";
        return select2(sql);
    }

    public ThongTinKhachHang selectChuHo(String CanHoID) {
        String sql = "SELECT TT.* FROM dbo.ThongTinKhachHang TT JOIN dbo.CanHo CH ON CH.KhachHangId = TT.KhachHangId WHERE CH.CanHoId = ? ";
        List<ThongTinKhachHang> list = select(sql, CanHoID);
        return list.size() > 0 ? list.get(0) : null;
    }

    public ThongTinKhachHang selectByIdKH(String MaKH) {
        String sql = "SELECT * FROM dbo.ThongTinKhachHang WHERE KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void updateCanHo(ThongTinKhachHang model) {
        String sql = "  UPDATE dbo.ThongTinKhachHang SET CanHoId = ? , Chuho = 0 WHERE KhachHangId = ?";
        JDBC.executeUpdate(sql,
                model.getCanHoid(),
                model.getKhachHangid());
    }
     public void updateCanHoTinhTrangO(ThongTinKhachHang model) {
        String sql = "UPDATE dbo.CanHo SET TinhTrang = 1 WHERE CanHoId = ?";
        JDBC.executeUpdate(sql,
                model.getCanHoid());
    }
      public void updateCanHoTinhTrangTrong(ThongTinKhachHang model) {
        String sql = "UPDATE dbo.CanHo SET TinhTrang = 0 WHERE CanHoId = ?";
        JDBC.executeUpdate(sql,
                model.getCanHoid());
    }

    public void updateChuHo(String Ten, String Ten2, String CanhoId) {
        String sql = "UPDATE dbo.ThongTinKhachHang SET ChuHo = 0 WHERE TenKhachHang LIKE ? AND CanHoId = ?\n"
                + "UPDATE dbo.ThongTinKhachHang SET ChuHo = 1 WHERE TenKhachHang LIKE ? AND CanHoId = ?";
        JDBC.executeUpdate(sql, "%" + Ten + "%", CanhoId, "%" + Ten2 + "%", CanhoId);
    }

    public void updateChuSoHuu(String MaKH, String MaCanHo) {
        String sql = "UPDATE dbo.CanHo SET KhachHangId = ? WHERE CanHoId = ?";
        JDBC.executeUpdate(sql, MaKH, MaCanHo);
    }

    public void updateLoaiBo(String MaKH) {
        String sql = "UPDATE dbo.ThongTinKhachHang SET CanHoId = NULL , Chuho = 0 WHERE KhachHangId = ?";
        JDBC.executeUpdate(sql, MaKH);
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

    private List<ThongTinKhachHang> select2(String sql, Object... args) {
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
        model.setKhachHangid(rs.getString(1));
        model.setCanHoid(rs.getString(2));
        model.setTenKhachHang(rs.getString(3));
        model.setCMND(rs.getString(4));
        model.setGioiTinh(rs.getBoolean(5));
        model.setSodt(rs.getString(6));
        model.setEmail(rs.getString(7));
        model.setTrangThai(rs.getString(8));
        model.setChuHo(rs.getBoolean(9));
        return model;
    }
}
