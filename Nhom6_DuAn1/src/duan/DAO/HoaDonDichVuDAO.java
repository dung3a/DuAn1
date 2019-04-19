/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.HoaDonDichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class HoaDonDichVuDAO {

    public List<HoaDonDichVu> selectHoaDon(int Thang, int Nam) {
        String sql = "SELECT DV.HoaDonDichVuId,CH.MaSoCanHo,DV.TienDichVuCoBan,GX.TongTienGui,DV.TongTien,DV.Thang,DV.UserId \n"
                + "FROM dbo.HoaDonDichVu DV JOIN dbo.GuiXe GX ON  GX.GuiXeId = DV.GuiXeId AND GX.CanHoId = DV.CanHoId JOIN  dbo.CanHo CH ON CH.CanHoId = DV.CanHoId\n"
                + " WHERE MONTH(Thang) = ? AND YEAR(Thang) = ? ORDER BY CH.CanHoId";
        return select(sql, Thang, Nam);
    }

    public HoaDonDichVu selectHoaDonIdCH(String MaCH, int Thang, int Nam) {
        String sql  = "SELECT DV.HoaDonDichVuId,CH.MaSoCanHo,DV.TienDichVuCoBan,GX.TongTienGui,DV.TongTien,DV.Thang,DV.UserId \n"
                + "FROM dbo.HoaDonDichVu DV JOIN dbo.GuiXe GX ON DV.GuiXeId = DV.GuiXeId AND GX.CanHoId = DV.CanHoId \n"
                + "JOIN dbo.CanHo CH ON CH.CanHoId = DV.CanHoId\n"
                + "WHERE CH.MaSoCanHo = ?  AND MONTH(Thang) = ? AND YEAR(Thang) = ? ";
        List<HoaDonDichVu> list = select(sql, MaCH, Thang, Nam);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void insertHoaDon(HoaDonDichVu model) {
        String sql = "INSERT dbo.HoaDonDichVu (  CanHoId , TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId )VALUES  ( ? ,   ? ,  ?, ? , GETDATE() ,  ?  )";
        JDBC.executeUpdate(sql,
                model.getCanHoid(),
                model.getTienDichVuCoBan(),
                model.getGuiXeID(),
                model.getTongTien(),
                model.getUserID());
    }
     public void updateHoaDon(HoaDonDichVu model, int Month,int Year) {
        String sql = "  UPDATE dbo.HoaDonDichVu SET TienDichVuCoBan = ? , TongTien = ? WHERE CanHoId = ? AND MONTH(Thang) = ? AND YEAR(Thang) = ?";
        JDBC.executeUpdate(sql,
                model.getTienDichVuCoBan(),
                model.getTongTien(),
                model.getCanHoid(),
                Month,
                Year);
    }

    private List<HoaDonDichVu> select(String sql, Object... args) {
        List<HoaDonDichVu> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonDichVu model = readFromResultSet(rs);
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

    private HoaDonDichVu readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonDichVu model = new HoaDonDichVu();
        model.setHoaDonDichVuid(rs.getString(1));
        model.setCanHoid(rs.getString(2));
        model.setTienDichVuCoBan(rs.getFloat(3));
        model.setTienGuiXe(rs.getFloat(4));
        model.setTongTien(rs.getFloat(5));
        model.setThang(rs.getDate(6));
        model.setUserID(rs.getString(7));
        return model;
    }
}
