/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadonemodevi;

/**
 *
 * @author win10
 */
public class Kisi {
    private String ad;
    private String soyad;
    private String email;
    private double telefonNumarasi;
    
    public Kisi(String ad,String soyad,String email,double telefonNumarasi){
    
        this.ad=ad;
        this.soyad=soyad;
        this.email=email;
        this.telefonNumarasi=telefonNumarasi;
    }
    
     public void setad(String ad){
    
        this.ad=ad;
    
    }
    
    public String getad(){
    
        return ad;
    
    }
    
    public void setsoyad(String soyad){
    
        this.soyad=soyad;
    
    }
    
    public String getsoyad(){
    
        return soyad;
    
    }
    
    public void setemail(String email){
    
        this.email=email;
    
    }
    
    public String getemail(){
    
        return email;
    
    }
    
    public void settelefonNumarasi(double telefonNumarasi){
    
        this.telefonNumarasi=telefonNumarasi;
    
    }
    
    public double gettelefonNumarasi(){
    
        return telefonNumarasi;
    
    }
    
    @Override
    public String toString(){
    
        return(" ad: " + ad +" soyad: "+ soyad + " email:"+ email+" tel numarası:"+telefonNumarasi);
    
    }
    
}
