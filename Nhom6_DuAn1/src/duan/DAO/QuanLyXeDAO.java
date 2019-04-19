/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.QuanLyXe;
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

    public List<QuanLyXe> selectQuanLyXe() {
        String sql = " SELECT CH.MaSoCanHo , TT.TenKhachHang , GX.SoLuongXeDap , GX.SoLuongXeMay , GX.SoLuongXeHoi, GX.TongTienGui \n"
                + " FROM CanHo CH JOIN ThongTinKhachHang TT ON TT.CanHoId = CH.CanHoId JOIN GuiXe GX ON GX.CanHoId = CH.CanHoId WHERE TT.ChuHo = 1";
        return select(sql);
    }

    public QuanLyXe selectGuiXe(String MaCH) {
        String sql = "SELECT CH.MaSoCanHo,KH.TenKhachHang,GX.SoLuongXeDap,GX.SoLuongXeMay,GX.SoLuongXeHoi,"
                + "GX.TongTienGui FROM dbo.GuiXe GX JOIN dbo.ThongTinKhachHang KH \n"
                + "ON KH.CanHoId = GX.CanHoId JOIN dbo.CanHo CH ON CH.CanHoId = GX.CanHoId WHERE KH.ChuHo = 1 AND CH.MaSoCanHo =  ? ";
        List<QuanLyXe> list = select(sql, MaCH);
        return list.size() > 0 ? list.get(0) : null;
    }

    public void updateXe(QuanLyXe model) {
        String sql = "  UPDATE dbo.GuiXe  SET SoLuongXeDap = ? , "
                + "TienGuiXeDap = SoLuongXeDap * ? ,"
                + "SoLuongXeMay = ? ,"
                + "TienGuiXeMay = SoLuongXeMay * ? ,"
                + "SoLuongXeHoi = ? ,"
                + "TienGuiXeHoi = SoLuongXeHoi * ? ,"
                + "TongTienGui = ? WHERE CanHoId = ?";
        JDBC.executeUpdate(sql,
                model.getSoLuongXeDap(),
                model.getTienGuiXeDap(),
                model.getSoLuongXeMay(),
                model.getTienGuiXeMay(),
                model.getSoLuongXeHoi(),
                model.getTienGuiXeHoi(),
                model.getTongTienGui(),
                model.getCanHoID()
        );
    }

    public void updateXoaXe(ThongTinKhachHang model) {
       String sql = "  UPDATE dbo.GuiXe  SET SoLuongXeDap = 0 , "
                + "TienGuiXeDap = 0 ,"
                + "SoLuongXeMay = 0 ,"
                + "TienGuiXeMay = 0 ,"
                + "SoLuongXeHoi = 0 ,"
                + "TienGuiXeHoi = 0,"
                + "TongTienGui = 0 WHERE CanHoId = ?";
        JDBC.executeUpdate(sql, model.getCanHoid());
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
        model.setCanHoID(rs.getString(1));
        model.setTenKhachHang(rs.getString(2));
        model.setSoLuongXeDap(rs.getInt(3));
        model.setSoLuongXeMay(rs.getInt(4));
        model.setSoLuongXeHoi(rs.getInt(5));
        model.setTongTienGui(rs.getFloat(6));
        return model;
    }

    

   

  
}
