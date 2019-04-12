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
    
    private String Loai;
    private int SoLuong;
    
    public QuanLyXe(){
    }
    
    public QuanLyXe(String MaSoCanHo , String TenKhachHang  , String Loai , int SoLuong){
        this.MaSoCanHo = MaSoCanHo;
        this.TenKhachHang = TenKhachHang ;
        this.Loai = Loai;
        this.SoLuong = SoLuong;
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

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
}

