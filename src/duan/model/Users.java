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
public class Users {
    private String Userid;
    private String Pass ;
    private String Ten ;
    private String Email ;
    private String Sdt ;
   
   public Users(){
} 
   public Users(String Userid , String Pass , String Ten , String Email , String Sdt){
       this.Userid = Userid ;
       this.Pass = Pass ;
       this.Ten = Ten;
       this.Email = Email ;
       this.Sdt = Sdt ;
   }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String Userid) {
        this.Userid = Userid;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
   
}
