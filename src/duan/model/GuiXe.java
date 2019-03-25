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
public class GuiXe {
    
    private String GuiXeid;
    private String HoaDonDichVuid ;
    private String LoaiXeid;
    private int SoLuong;
    private float TienGuiXe;
    
    public GuiXe(){
    }
    
    public GuiXe(String GuiXeid , String HoaDonDichVuid , 
            String LoaiXeid , int SoLuong , float TienGuiXe){
        
        this.GuiXeid = GuiXeid;
        this.HoaDonDichVuid = HoaDonDichVuid;
        this.LoaiXeid = LoaiXeid;
        this.SoLuong = SoLuong;
        this.TienGuiXe = TienGuiXe;
    }

    public String getGuiXeid() {
        return GuiXeid;
    }

    public void setGuiXeid(String GuiXeid) {
        this.GuiXeid = GuiXeid;
    }

    public String getHoaDonDichVuid() {
        return HoaDonDichVuid;
    }

    public void setHoaDonDichVuid(String HoaDonDichVuid) {
        this.HoaDonDichVuid = HoaDonDichVuid;
    }

    public String getLoaiXeid() {
        return LoaiXeid;
    }

    public void setLoaiXeid(String LoaiXeid) {
        this.LoaiXeid = LoaiXeid;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getTienGuiXe() {
        return TienGuiXe;
    }

    public void setTienGuiXe(float TienGuiXe) {
        this.TienGuiXe = TienGuiXe;
    }
    
}
