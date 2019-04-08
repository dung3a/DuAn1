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
public class ThongTinKhachHangDAO2 {
    /*Quản Lý nhân Khẩu*/
    public List<ThongTinKhachHang> selectQuanLy(String MaKH) {
        String sql = "SELECT * FROM dbo.ThongTinKhachHang ";
        return select(sql);
    }

    public List<ThongTinKhachHang> selectByKeyword(String keyword) {
        String sql = "  SELECT * FROM dbo.ThongTinKhachHang WHERE KhachHangId LIKE ? OR TenKhachHang LIKE ? OR CMND LIKE ?";
        return select(sql, "%" + keyword + "%", "%" + keyword + "%", keyword);
    }

    public ThongTinKhachHang selectQuanLyByIdKH(String MaKH) {
        String sql = "SELECT * FROM dbo.ThongTinKhachHang WHERE KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void insertQuanLy(ThongTinKhachHang model) {
        String sql = "  INSERT dbo.ThongTinKhachHang (  TenKhachHang ,CMND ,GioiTinh ,SoDT ,Email ,TrangThai )VALUES  (?,?,?,?,?,?)";
        JDBC.executeUpdate(sql,
                model.getTenKhachHang(),
                model.getCMND(),
                model.getGioiTinh(),
                model.getSodt(),
                model.getEmail(),
                model.getTrangThai());
    }

    public void updateQuanLy(ThongTinKhachHang model) {
        String sql = "  UPDATE dbo.ThongTinKhachHang SET TenKhachHang = ?, CMND = ?, GioiTinh = ?, SoDT = ?, Email = ?, TrangThai = ? WHERE KhachHangId = ?";
        JDBC.executeUpdate(sql,
                model.getTenKhachHang(),
                model.getCMND(),
                model.getGioiTinh(),
                model.getSodt(),
                model.getEmail(),
                model.getTrangThai(),
                model.getKhachHangid());
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
        model.setKhachHangid(rs.getString(1));
        model.setCanHoid(rs.getString(2));
        model.setTenKhachHang(rs.getString(3));
        model.setCMND(rs.getString(4));
        model.setGioiTinh(rs.getBoolean(5));
        model.setSodt(rs.getString(6));
        model.setEmail(rs.getString(7));
        model.setTrangThai(rs.getString(8));
        return model;
    }
}
