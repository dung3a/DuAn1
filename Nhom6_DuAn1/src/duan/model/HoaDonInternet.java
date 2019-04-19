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
public class HoaDonInternet {
    
    private String HoaDonInternetid;
    private String CanHoid;
    private Date NgayThang;
    private int Tien;
    
    public HoaDonInternet(){
    }
    
    public HoaDonInternet(String HoaDonInternetid , 
                          String CanHoid ,Date NgayThang ,int Tien){
        this.HoaDonInternetid = HoaDonInternetid;
        this.CanHoid = CanHoid;
        this.NgayThang = NgayThang;
        this.Tien = Tien;
    }

    public String getHoaDonInternetid() {
        return HoaDonInternetid;
    }

    public void setHoaDonInternetid(String HoaDonInternetid) {
        this.HoaDonInternetid = HoaDonInternetid;
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

    public int getTien() {
        return Tien;
    }

    public void setTien(int Tien) {
        this.Tien = Tien;
    }

   
    
}
