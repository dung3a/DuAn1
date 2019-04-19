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
public class ThongTinKhachHang {
    private String KhachHangid ; 
    private String CanHoid ;
    private String TenKhachHang ;
    private String CMND ;
    private boolean GioiTinh ;
    private String Sodt ;
    private String Email ;
    private String TrangThai ;
    private boolean ChuHo  ;
    
    public ThongTinKhachHang(){
    }

    
    public ThongTinKhachHang(String KhachHangid , String CanHoid ,
                             String TenKhachHang , String CMND , 
                             boolean GioiTinh , String Sodt , 
                             String Email , String TrangThai, boolean ChuHo ){
      this.KhachHangid = KhachHangid;
      this.CanHoid = CanHoid;
      this.TenKhachHang = TenKhachHang;
      this.CMND = CMND;
      this.GioiTinh = GioiTinh;
      this.Sodt = Sodt;
      this.Email = Email;
      this.TrangThai = TrangThai;
      this.ChuHo = ChuHo;
    }

    public String getKhachHangid() {
        return KhachHangid;
    }

    public void setKhachHangid(String KhachHangid) {
        this.KhachHangid = KhachHangid;
    }

    public String getCanHoid() {
        return CanHoid;
    }

    public void setCanHoid(String CanHoid) {
        this.CanHoid = CanHoid;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSodt() {
        return Sodt;
    }

    public void setSodt(String Sodt) {
        this.Sodt = Sodt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    public boolean isChuHo() {
        return ChuHo;
    }

    public void setChuHo(boolean ChuHo) {
        this.ChuHo = ChuHo;
    }
    
}
