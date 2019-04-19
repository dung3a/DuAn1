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
public class HoaDonDichVu {
    private String HoaDonDichVuid ;
    private String HoaDonid;
    private String CanHoid;
    private float TienDichVuCoBan;
    private float TienGuiXe;
    private int GuiXeID;
    private float TongTien;
    private Date Thang;
    private String UserID;
    public HoaDonDichVu(){
    }
    
    public HoaDonDichVu(String HoaDonDichVuid , String HoaDonid ,
            String CanHoid , float TienDichVuCoBan , float TienGuiXe ,
            float TongTien , Date Thang,String UserID){
       
        this.HoaDonDichVuid = HoaDonDichVuid;
        this.HoaDonid = HoaDonid;
        this.CanHoid = CanHoid;
        this.TienDichVuCoBan = TienDichVuCoBan;
        this.TienGuiXe = TienGuiXe;
        this.TongTien = TongTien;
        this.Thang = Thang;
        this.UserID = UserID;
    }

    public int getGuiXeID() {
        return GuiXeID;
    }

    public void setGuiXeID(int GuiXeID) {
        this.GuiXeID = GuiXeID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getHoaDonDichVuid() {
        return HoaDonDichVuid;
    }

    public void setHoaDonDichVuid(String HoaDonDichVuid) {
        this.HoaDonDichVuid = HoaDonDichVuid;
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

    public float getTienDichVuCoBan() {
        return TienDichVuCoBan;
    }

    public void setTienDichVuCoBan(float TienDichVuCoBan) {
        this.TienDichVuCoBan = TienDichVuCoBan;
    }

    public float getTienGuiXe() {
        return TienGuiXe;
    }

    public void setTienGuiXe(float TienGuiXe) {
        this.TienGuiXe = TienGuiXe;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public Date getThang() {
        return Thang;
    }

    public void setThang(Date Thang) {
        this.Thang = Thang;
    }
    
}
