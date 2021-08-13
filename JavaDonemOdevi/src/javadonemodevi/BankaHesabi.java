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
public class BankaHesabi {
    
    private final double iban;
    private double bakiye;
        
    public BankaHesabi(double iban,double bakiye){
    this.iban=iban;
    this.bakiye=bakiye;    
    }
    
    public double randomiban(){
        double randomiban=(int) Math.ceil(Math.random() * 10000000)+100000;
        return randomiban;
    }
    
    public void setbakiye(double bakiye){
    
        this.bakiye=bakiye;
    
    }
    
    public  double getbakiye(){
    
        return bakiye;
    
    }
    
    @Override
        public String toString(){
            
            return(super.toString()+"\n iban:"+iban+"\n bakiye:"+bakiye);               
        }
    
}
