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

    public List<ThongTinKhachHang> selectByIdCH(String canhoID) {
        String sql = "SELECT TT.KhachHangId, TT.CanHoId , TT.TenKhachHang, TT.CMND ,TT.GioiTinh ,TT.SoDT ,TT.Email ,TT.TrangThai ,TT.ChuHo "
                + "FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH "
                + "ON CH.KhachHangId = TT.KhachHangId OR CH.CanHoId = TT.CanHoId "
                + "WHERE CH.CanHoId = ?";
        return select(sql, canhoID);
    }

    public ThongTinKhachHang selectByIdKH(String MaKH) {
        String sql = "SELECT * FROM dbo.ThongTinKhachHang WHERE KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<ThongTinKhachHang> selectQuanLy(String MaKH) {
        String sql = "SELECT TT.KhachHangId,CH.MaSoCanHo,TT.TenKhachHang,"
                + "TT.CMND,TT.GioiTinh,TT.SoDT,TT.Email,TT.TrangThai,TT.ChuHo  "
                + "FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH"
                + " ON  CH.CanHoId = TT.CanHoId OR CH.KhachHangId = TT.KhachHangId";
        return select(sql);
    }

    public ThongTinKhachHang selectQuanLyByIdKH(String MaKH) {
        String sql = "SELECT TT.KhachHangId,CH.MaSoCanHo,TT.TenKhachHang,TT.CMND"
                + ",TT.GioiTinh,TT.SoDT,TT.Email,TT.TrangThai,TT.ChuHo "
                + "FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH "
                + "ON  CH.CanHoId = TT.CanHoId WHERE TT.KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql, MaKH);
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
