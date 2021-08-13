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
public class YatirimHesabi extends BankaHesabi{
    private String hesapTuru;
    public YatirimHesabi(double iban,double bakiye,String hesapTuru){
    super(iban,bakiye);
    this.hesapTuru=hesapTuru;
        
    
    }
    
    public void sethesapTuru(String hesapTuru){
    
        this.hesapTuru=hesapTuru;
    }
    public String gethesapTuru(){
    
        return hesapTuru;
    }
    
    public void paraEkle(BankaHesabi a,YatirimHesabi b,double x){
        double d=a.getbakiye()-x;//gonderen hesabimizdan para dusuldu ve yeni miktar d degerine atildi
        double s=b.getbakiye()+x;//gonderilen miktar yatirim hesabimiza eklendi ve yeni miktar s degerine atildi
        a.setbakiye(d);//yeni deger geri donduruldu 
        b.setbakiye(s);//yeni deger geri donduruldu    
    }
    
    public void paraCek(YatirimHesabi a,BankaHesabi b,double x){
        double d=a.getbakiye()-x;//yatirim hesabimizdan  para dusuldu ve yeni miktar d degerine atildi
        double s=b.getbakiye()+x;//gonderilen miktar hesabimiza eklendi ve yeni miktar s degerine atildi
        a.setbakiye(d);//yeni deger geri donduruldu 
        b.setbakiye(s);//yeni deger geri donduruldu    
   
    
    
    }
    
    
    @Override
        public String toString(){
            
            return(super.toString()+"\n hesap türü:"+hesapTuru);               
        }
}
