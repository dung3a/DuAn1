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
        String sql = "  SELECT TT.*,dbo.CHECK_CHUHO(ch.CanHoId,TT.KhachHangId) "
                + "FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH "
                + "ON CH.KhachHangId = TT.KhachHangId OR CH.CanHoId = TT.CanHoId WHERE CH.CanHoId = ?";
        return select(sql, canhoID);
    }

    public ThongTinKhachHang selectByIdKH(String MaKH) {
        String sql = "SELECT TT.*,dbo.CHECK_CHUHO(CH.CanHoId,TT.KhachHangId) "
                + "FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH "
                + "ON  CH.CanHoId = TT.CanHoId OR CH.KhachHangId = TT.KhachHangId "
                + "WHERE TT.KhachHangId = ?";
        List<ThongTinKhachHang> list = select(sql, MaKH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void updateCanHo(ThongTinKhachHang model) {
        String sql = "  UPDATE dbo.ThongTinKhachHang SET CanHoId = ? WHERE KhachHangId = ?";
        JDBC.executeUpdate(sql,
                model.getCanHoid(),
                model.getKhachHangid());
    }

    public void updateChuHo(String Ten, String CanhoId) {
        String sql = "UPDATE dbo.CanHo SET KhachHangId = (SELECT KhachHangId FROM dbo.ThongTinKhachHang WHERE TenKhachHang LIKE ?),"
                + " CMNDChuHo = (SELECT CMND FROM dbo.ThongTinKhachHang WHERE TenKhachHang LIKE ?)"
                + " WHERE CanHo.CanHoId = ?";
        JDBC.executeUpdate(sql, "%" + Ten + "%", "%" + Ten + "%", CanhoId);
    }

    public void  updateLoaiBo(String MaKH){
        String sql="UPDATE dbo.ThongTinKhachHang SET CanHoId = NULL, TrangThai = N'Đã Rời Đi' WHERE KhachHangId = ?";
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
