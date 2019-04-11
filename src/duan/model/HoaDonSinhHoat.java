/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.model;

import java.util.Date;

/**
 *
 * @author Tam Fat
 */
public class HoaDonSinhHoat {
    private int HoaDonSinhHoatid ;
    private String HoaDonid;
    private String CanHoid;
    private Date NgayThang ;
    
    private String MaHDDien;
    private int ChiSoDienBanDau ;
    private int ChiSoDienCuoi ;
    private int TienDien;
    
    private String MaHDNuoc;
    private int ChiSoNuocBanDau ;
    private int ChiSoNuocCuoi ;
    private int TienNuoc ;
    
    public HoaDonSinhHoat(){
    }
    
    public HoaDonSinhHoat(int HoaDonSinhHoatid , String HoaDonid ,String CanHoid , Date NgayThang ,
            String MaHDDien, int ChiSoDienBanDau , int ChiSoDienCuoi , int TienDien ,
            String MaHDNuoc,int ChiSoNuocBanDau , int ChiSoNuocCuoi , int TienNuoc ){
        
        this.HoaDonSinhHoatid = HoaDonSinhHoatid;
        this.HoaDonid = HoaDonid;
        this.CanHoid = CanHoid;
        this.NgayThang = NgayThang ;
        this.MaHDDien = MaHDDien;
        this.ChiSoDienBanDau = ChiSoDienBanDau ;
        this.ChiSoDienCuoi = ChiSoDienCuoi ;
        this.TienDien = TienDien;
        this.MaHDNuoc = MaHDNuoc;
        this.ChiSoNuocBanDau = ChiSoNuocBanDau ;
        this.ChiSoNuocCuoi = ChiSoNuocCuoi;
        this.TienNuoc = TienNuoc;
    }

    public String getMaHDDien() {
        return MaHDDien;
    }

    public void setMaHDDien(String MaHDDien) {
        this.MaHDDien = MaHDDien;
    }

    public String getMaHDNuoc() {
        return MaHDNuoc;
    }

    public void setMaHDNuoc(String MaHDNuoc) {
        this.MaHDNuoc = MaHDNuoc;
    }

    public int getHoaDonSinhHoatid() {
        return HoaDonSinhHoatid;
    }

    public void setHoaDonSinhHoatid(int HoaDonSinhHoatid) {
        this.HoaDonSinhHoatid = HoaDonSinhHoatid;
    }

    public String getHoaDonid() {
        return HoaDonid;
    }

    public void setHoaDonid(String HoaDonid) {
        this.HoaDonid = HoaDonid;
    }

    public String getCanHoid() {
        return CanHoid;
    }

    public void setCanHoid(String CanHoid) {
        this.CanHoid = CanHoid;
    }

    public Date getNgayThang() {
        return NgayThang;
    }

    public void setNgayThang(Date NgayThang) {
        this.NgayThang = NgayThang;
    }

    public int getChiSoDienBanDau() {
        return ChiSoDienBanDau;
    }

    public void setChiSoDienBanDau(int ChiSoDienBanDau) {
        this.ChiSoDienBanDau = ChiSoDienBanDau;
    }

    public int getChiSoDienCuoi() {
        return ChiSoDienCuoi;
    }

    public void setChiSoDienCuoi(int ChiSoDienCuoi) {
        this.ChiSoDienCuoi = ChiSoDienCuoi;
    }

    public int getTienDien() {
        return TienDien;
    }

    public void setTienDien(int TienDien) {
        this.TienDien = TienDien;
    }

    public int getChiSoNuocBanDau() {
        return ChiSoNuocBanDau;
    }

    public void setChiSoNuocBanDau(int ChiSoNuocBanDau) {
        this.ChiSoNuocBanDau = ChiSoNuocBanDau;
    }

    public int getChiSoNuocCuoi() {
        return ChiSoNuocCuoi;
    }

    public void setChiSoNuocCuoi(int ChiSoNuocCuoi) {
        this.ChiSoNuocCuoi = ChiSoNuocCuoi;
    }

    public int getTienNuoc() {
        return TienNuoc;
    }

    public void setTienNuoc(int TienNuoc) {
        this.TienNuoc = TienNuoc;
    }
    
}
