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

    private String CanHoID;
    private String TenKhachHang;
    private int SoLuongXeDap;
    private float TienGuiXeDap;
    private int SoLuongXeMay;
    private float TienGuiXeMay;
    private int SoLuongXeHoi;
    private float TienGuiXeHoi;
    private float TongTienGui;

    public QuanLyXe() {
    }

    public QuanLyXe(String CanHoID, String TenKhachHang, int SoLuongXeDap, int SoLuongXeMay, int SoLuongXeHoi, float TongTienGui) {
        this.CanHoID = CanHoID;
        this.TenKhachHang = TenKhachHang;
        this.SoLuongXeDap = SoLuongXeDap;
        this.SoLuongXeMay = SoLuongXeMay;
        this.SoLuongXeHoi = SoLuongXeHoi;
        this.TongTienGui = TongTienGui;
    }

    public float getTienGuiXeDap() {
        return TienGuiXeDap;
    }

    public void setTienGuiXeDap(float TienGuiXeDap) {
        this.TienGuiXeDap = TienGuiXeDap;
    }

    public float getTienGuiXeMay() {
        return TienGuiXeMay;
    }

    public void setTienGuiXeMay(float TienGuiXeMay) {
        this.TienGuiXeMay = TienGuiXeMay;
    }

    public float getTienGuiXeHoi() {
        return TienGuiXeHoi;
    }

    public void setTienGuiXeHoi(float TienGuiXeHoi) {
        this.TienGuiXeHoi = TienGuiXeHoi;
    }

    
    public String getCanHoID() {
        return CanHoID;
    }

    public void setCanHoID(String CanHoID) {
        this.CanHoID = CanHoID;
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
