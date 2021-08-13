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
public class VadesizHesap extends BankaHesabi {
    private String hesapTuru;
    public VadesizHesap(double iban,double bakiye,String hesapTuru){
    super(iban,bakiye);
    this.hesapTuru=hesapTuru;
        
    
    }
    
    public void sethesapTuru(String hesapTuru){
    
        this.hesapTuru=hesapTuru;
    }
    public String gethesapTuru(){
    
        return hesapTuru;
    }
    public void paraTransferi(BankaHesabi a,BankaHesabi b,double x){
        double s=a.getbakiye()-x;// birinci hesaptan x değeri kadar para düşüldü
        a.setbakiye(s);
        
        double d=b.getbakiye()+x;// ikinci hesaba x değeri kadar para eklendi
        b.setbakiye(d);
    }
    
    public void krediKartiBorcOdeme(KrediKarti a,VadesizHesap b,double x){// bu adımlar vadesiz hesaptan para yollanabilecek şekilde tanımlandı . değiştirilebilir
        double f=a.getguncelBorc()-x;// borcumuz düşürülür
        double g=b.getbakiye()-x;//paramızın miktarı düşürülür        
        a.setguncelBorc(f); //son borç miktarı ayarlanır
        b.setbakiye(g); // son bakiye ayarlanır
        
        
    }
        
    
    //hesap türü müşteri sınıfında hesap eklemek için kullanılacak muhtemelen
    
    
    @Override
        public String toString(){
            
            return(super.toString()+"\n hesap türü:"+hesapTuru);               
        }
}
