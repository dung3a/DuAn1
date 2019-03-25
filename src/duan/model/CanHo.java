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
public class CanHo {
    private String CanHoid ;
    private String MaSoCanHo ;
    private String KhachHangid ;
    private byte Tang ;
    
    public CanHo(){
    }

    public CanHo(String CanHoid , String MaSoCanHo , String KhachHangid , byte Tang){
        this.CanHoid = CanHoid ;
        this.MaSoCanHo = MaSoCanHo ;
        this.KhachHangid = KhachHangid ;
        this.Tang = Tang ;
    }
    
    public String getCanHoid() {
        return CanHoid;
    }

    public void setCanHoid(String CanHoid) {
        this.CanHoid = CanHoid;
    }

    public String getMaSoCanHo() {
        return MaSoCanHo;
    }

    public void setMaSoCanHo(String MaSoCanHo) {
        this.MaSoCanHo = MaSoCanHo;
    }

    public String getKhachHangid() {
        return KhachHangid;
    }

    public void setKhachHangid(String KhachHangid) {
        this.KhachHangid = KhachHangid;
    }

    public byte getTang() {
        return Tang;
    }

    public void setTang(byte Tang) {
        this.Tang = Tang;
    }
    
}
