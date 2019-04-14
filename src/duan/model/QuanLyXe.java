/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.model;

/**
 *
 * @author Tam Fat
 */
public class QuanLyXe {
    
    private String MaSoCanHo ;
    private String TenKhachHang ;
    private int SoLuongXeDap; 
    private int SoLuongXeMay; 
    private int SoLuongXeHoi; 
    private float TongTienGui;
    
   
    public QuanLyXe(){
}
    
    public QuanLyXe(String MaSoCanHo , String TenKhachHang  , int SoLuongXeDap , int SoLuongXeMay ,int SoLuongXeHoi, float TongTienGui){
        this.MaSoCanHo = MaSoCanHo;
        this.TenKhachHang = TenKhachHang ;
        this.SoLuongXeDap = SoLuongXeDap ;
        this.SoLuongXeMay = SoLuongXeMay ; 
        this.SoLuongXeHoi = SoLuongXeHoi ;
        this.TongTienGui = TongTienGui;
    }

    public String getMaSoCanHo() {
        return MaSoCanHo;
    }

    public void setMaSoCanHo(String MaSoCanHo) {
        this.MaSoCanHo = MaSoCanHo;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public int getSoLuongXeDap() {
        return SoLuongXeDap;
    }

    public void setSoLuongXeDap(int SoLuongXeDap) {
        this.SoLuongXeDap = SoLuongXeDap;
    }

    public int getSoLuongXeMay() {
        return SoLuongXeMay;
    }

    public void setSoLuongXeMay(int SoLuongXeMay) {
        this.SoLuongXeMay = SoLuongXeMay;
    }

    public int getSoLuongXeHoi() {
        return SoLuongXeHoi;
    }

    public void setSoLuongXeHoi(int SoLuongXeHoi) {
        this.SoLuongXeHoi = SoLuongXeHoi;
    }

    public float getTongTienGui() {
        return TongTienGui;
    }

    public void setTongTienGui(float TongTienGui) {
        this.TongTienGui = TongTienGui;
    }


    
}

   


