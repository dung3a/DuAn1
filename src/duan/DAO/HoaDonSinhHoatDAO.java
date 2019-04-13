/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.DAO;

import duan.JDBC.JDBC;
import duan.model.HoaDonSinhHoat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class HoaDonSinhHoatDAO {

    public List<HoaDonSinhHoat> selectHoaDon(int Thang, int Nam) {
        String sql = "SELECT  HD.HoaDonSinhHoatId,CH.MaSoCanHo,HD.NgayThang,HD.MaHDDien,HD.ChiSoDienBanDau,HD.ChiSoDienCuoi,CAST(HD.TienDien AS INT) AS TienDien,HD.MaHDNuoc,HD.ChiSoNuocBanDau,HD.ChiSoNuocCuoi,CAST(HD.TienNuoc AS INT) AS TienNuoc "
                + "FROM dbo.HoaDonSinhHoat HD JOIN dbo.CanHo CH ON CH.CanHoId = HD.CanHoId "
                + "WHERE MONTH(NgayThang)= ? AND YEAR(NgayThang) = ? ORDER BY CH.MaSoCanHo";
        return select(sql, Thang, Nam);
    }

      public HoaDonSinhHoat selectHoaDonIdCH(String MaCH, int Thang, int Nam) {
        String sql = "SELECT  HD.HoaDonSinhHoatId,CH.MaSoCanHo,HD.NgayThang,HD.MaHDDien,HD.ChiSoDienBanDau,HD.ChiSoDienCuoi,CAST(HD.TienDien AS INT) AS TienDien, HD.MaHDNuoc,HD.ChiSoNuocBanDau,HD.ChiSoNuocCuoi,CAST(HD.TienNuoc AS INT) AS TienNuoc"
                + " FROM dbo.HoaDonSinhHoat HD JOIN dbo.CanHo CH ON  CH.CanHoId = HD.CanHoId "
                + "WHERE CH.MaSoCanHo = ? AND MONTH(NgayThang)= ? AND YEAR(NgayThang) = ?  ";
        List<HoaDonSinhHoat> list = select(sql, MaCH, Thang, Nam);
        return list.size() > 0 ? list.get(0) : null;
    }
    
     public void insertHoaDon(HoaDonSinhHoat model) {
        String sql = "INSERT dbo.HoaDonSinhHoat ( CanHoId ,NgayThang ,MaHDDien ,ChiSoDienBanDau ,ChiSoDienCuoi ,TienDien ,MaHDNuoc ,ChiSoNuocBanDau ,ChiSoNuocCuoi ,TienNuoc)"
                + " VALUES  ( ?,GETDATE(), ?,?,?,? ,?, ?,?, ?)";
        JDBC.executeUpdate(sql,
                model.getCanHoid(),
                model.getMaHDDien(),
                model.getChiSoDienBanDau(),
                model.getChiSoDienCuoi(),
                model.getTienDien(),
                model.getMaHDNuoc(),
                model.getChiSoNuocBanDau(),
                model.getChiSoNuocCuoi(),
                model.getTienNuoc());
    }
     
     public void updateHoaDon(HoaDonSinhHoat model, int Month,int Year) {
        String sql = "  UPDATE dbo.HoaDonSinhHoat SET MaHDDien = ?, ChiSoDienBanDau = ?, ChiSoDienCuoi = ?, TienDien = ? , MaHDNuoc = ? , "
                + "ChiSoNuocBanDau = ? , ChiSoNuocCuoi = ? , TienNuoc = ? WHERE CanHoId = ? AND MONTH(NgayThang) = ? AND YEAR(NgayThang) = ?";
        JDBC.executeUpdate(sql,
                model.getMaHDDien(),
                model.getChiSoDienBanDau(),
                model.getChiSoDienCuoi(),
                model.getTienDien(),
                model.getMaHDNuoc(),
                model.getChiSoNuocBanDau(),
                model.getChiSoNuocCuoi(),
                model.getTienNuoc(),
                model.getCanHoid(),
                Month,
                Year);
    }
    private List<HoaDonSinhHoat> select(String sql, Object... args) {
        List<HoaDonSinhHoat> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBC.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonSinhHoat model = readFromResultSet(rs);
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

    private HoaDonSinhHoat readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonSinhHoat model = new HoaDonSinhHoat();
        model.setHoaDonSinhHoatid(rs.getInt(1));
        model.setCanHoid(rs.getString(2));
        model.setNgayThang(rs.getDate(3));
        model.setMaHDDien(rs.getString(4));
        model.setChiSoDienBanDau(rs.getInt(5));
        model.setChiSoDienCuoi(rs.getInt(6));
        model.setTienDien(rs.getInt(7));
        model.setMaHDNuoc(rs.getString(8));
        model.setChiSoNuocBanDau(rs.getInt(9));
        model.setChiSoNuocCuoi(rs.getInt(10));
        model.setTienNuoc(rs.getInt(11));
        return model;
    }
}
