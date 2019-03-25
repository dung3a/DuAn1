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
    private String HoaDonSinhHoatid ;
    private String HoaDonid;
    private String CanHoid;
    private Date NgayThang ;
    
    private int ChiSoDienBanDau ;
    private int ChiSoDienCuoi ;
    private float TienDien;
    
    private int ChiSoNuocBanDau ;
    private int ChiSoNuocCuoi ;
    private float TienNuoc ;
    
    public HoaDonSinhHoat(){
    }
    
    public HoaDonSinhHoat(String HoaDonSinhHoatid , String HoaDonid ,String CanHoid , Date NgayThang ,
            int ChiSoDienBanDau , int ChiSoDienCuoi , float TienDien ,
            int ChiSoNuocBanDau , int ChiSoNuocCuoi , float TienNuoc ){
        
        this.HoaDonSinhHoatid = HoaDonSinhHoatid;
        this.HoaDonid = HoaDonid;
        this.CanHoid = CanHoid;
        this.NgayThang = NgayThang ;
        this.ChiSoDienBanDau = ChiSoDienBanDau ;
        this.ChiSoDienCuoi = ChiSoDienCuoi ;
        this.TienDien = TienDien;
        this.ChiSoNuocBanDau = ChiSoNuocBanDau ;
        this.ChiSoNuocCuoi = ChiSoNuocCuoi;
        this.TienNuoc = TienNuoc;
    }

    public String getHoaDonSinhHoatid() {
        return HoaDonSinhHoatid;
    }

    public void setHoaDonSinhHoatid(String HoaDonSinhHoatid) {
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

    public float getTienDien() {
        return TienDien;
    }

    public void setTienDien(float TienDien) {
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

    public float getTienNuoc() {
        return TienNuoc;
    }

    public void setTienNuoc(float TienNuoc) {
        this.TienNuoc = TienNuoc;
    }
    
}
