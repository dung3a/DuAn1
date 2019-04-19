/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.HoaDonInternet;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class HoaDonInternetDAO {

    public List<HoaDonInternet> selectHoaDon(int Thang, int Nam) {
        String sql = "SELECT  HD.HoaDonInternetId,CH.MaSoCanHo,HD.NgayThang,CAST(HD.Tien AS INT) AS Tien "
                + "FROM dbo.HoaDonInternet HD JOIN dbo.CanHo CH ON "
                + " CH.CanHoId = HD.CanHoId WHERE MONTH(NgayThang)= ? AND YEAR(NgayThang) = ? ORDER BY CH.MaSoCanHo";
        return select(sql, Thang, Nam);
    }

    
    public HoaDonInternet selectHoaDonIdCH(String MaCH, int Thang, int Nam) {
        String sql = "SELECT HD.HoaDonInternetId,CH.MaSoCanHo,HD.NgayThang,CAST(HD.Tien AS INT) AS Tien "
                + "FROM dbo.HoaDonInternet HD JOIN dbo.CanHo CH ON CH.CanHoId = HD.CanHoId "
                + "WHERE CH.MaSoCanHo = ? AND MONTH(HD.NgayThang) = ? AND YEAR(HD.NgayThang) = ? ";
        List<HoaDonInternet> list = select(sql, MaCH, Thang, Nam);
        return list.size() > 0 ? list.get(0) : null;
    }

     public void insertHoaDon(HoaDonInternet model) {
        String sql = "INSERT dbo.HoaDonInternet ( HoaDonInternetId ,CanHoId ,NgayThang ,Tien) VALUES  ( ? , ? , GETDATE() , ? )";
        JDBC.executeUpdate(sql,
                model.getHoaDonInternetid(),
                model.getCanHoid(),
                model.getTien());
    }
     
     public void updateHoaDon(HoaDonInternet model, int Month,int Year) {
        String sql = "  UPDATE dbo.HoaDonInternet SET HoaDonInternetId = ? , Tien = ? WHERE CanHoId = ? AND MONTH(NgayThang) = ? AND YEAR(NgayThang) = ?";
        JDBC.executeUpdate(sql,
                model.getHoaDonInternetid(),
                model.getTien(),
                model.getCanHoid(),
                Month,
                Year);
    }
    private List<HoaDonInternet> select(String sql, Object... args) {
        List<HoaDonInternet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonInternet model = readFromResultSet(rs);
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

    private HoaDonInternet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonInternet model = new HoaDonInternet();
        model.setHoaDonInternetid(rs.getString(1));
        model.setCanHoid(rs.getString(2));
        model.setNgayThang(rs.getDate(3));
        model.setTien(rs.getInt(4));
        return model;
    }
}
