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
public class LoaiXe {
    
    private String LoaiXeid;
    private String Loai;
    private float GiaTrongCoi;
    
    public LoaiXe(){
    }
    
    public LoaiXe(String LoaiXeid , String Loai , float GiaTrongCoi){
        
        this.LoaiXeid = LoaiXeid ;
        this.Loai = Loai;
        this.GiaTrongCoi = GiaTrongCoi;
    }

    public String getLoaiXeid() {
        return LoaiXeid;
    }

    public void setLoaiXeid(String LoaiXeid) {
        this.LoaiXeid = LoaiXeid;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public float getGiaTrongCoi() {
        return GiaTrongCoi;
    }

    public void setGiaTrongCoi(float GiaTrongCoi) {
        this.GiaTrongCoi = GiaTrongCoi;
    }
    
}
