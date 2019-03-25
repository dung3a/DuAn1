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
public class HoaDon {
    private String HoaDonid;
    private String CanHoid;
    private Date NgayLap ;
    private float TongTien;
    private String Userid ;
    private String Ten;
    
    public HoaDon(){
    }
    
    public HoaDon(String HoaDonid , String CanHoid , Date NgayLap,
                  float TongTien , String Userid , String Ten){
        this.HoaDonid = HoaDonid;
        this.CanHoid = CanHoid;
        this.NgayLap = NgayLap;
        this.TongTien= TongTien;
        this.Userid = Userid ;
        this.Ten = Ten;
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

    public Date getNgayLap() {
        return NgayLap;
    }

    public void setNgayLap(Date NgayLap) {
        this.NgayLap = NgayLap;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    
}
