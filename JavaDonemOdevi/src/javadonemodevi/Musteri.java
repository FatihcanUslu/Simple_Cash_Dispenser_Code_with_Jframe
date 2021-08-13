/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadonemodevi;

import java.util.ArrayList;

/**
 *
 * @author win10
 */
public class Musteri extends Kisi {
    
    private  int musteriNumarasi;
    private ArrayList <KrediKarti> krediKartlari;
    private ArrayList <BankaHesabi> hesaplar;
    
    public Musteri(String ad,String soyad,String email,double telefonNumarasi,int musteriNumarasi){
        
        super(ad, soyad, email,telefonNumarasi);
        this.musteriNumarasi=musteriNumarasi;
        krediKartlari=new ArrayList <KrediKarti>();
        hesaplar=new ArrayList <BankaHesabi>();
    
}
    
        public void setmusteriNumarasi(int musteriNumarasi){
    
        this.musteriNumarasi=musteriNumarasi;
    
    }
    
    public int getmusteriNumarasi(){
    
        return musteriNumarasi;
    
    }
    
        public int musterinumarasi(){//musteri numarasını 100 e kadar olan rastgele bir sayı olarak ürettik getmusteriNumarasi içindede tanımlanabilirdi
            
            int numara=(int)(Math.random()*100);
            
            return numara;
        }
    
        public void hesapEkle(BankaHesabi a){
            hesaplar.add(a);//bu adımda hem vadesiz hesap için hemde yatırım hesabı için ayrı ayrı 2 tane hesap ekleme yeri yapıcaksın             
        }
        public void krediKartiEkle(KrediKarti a){
            krediKartlari.add(a);                      
        }
        public void hesapSil(BankaHesabi a){
            double z=a.getbakiye();// doğruluğundan emin değilim bakalım
            if(z==0){
                hesaplar.remove(a);
                System.out.println("hesabınız silindi");
                }
            else
                System.out.println("lütfen bakiyenizini önce başka bir hesaba aktarin");
        }
        public void krediKartiSil(KrediKarti a){
            double z=a.getguncelBorc();// doğruluğundan emin değilim bakalım
            if(z==0){
                krediKartlari.remove(a);
                System.out.println("Kartiniz silindi");
                }
            else
                System.out.println("lütfen önce borcunuzu ödeyin");
        }
        
        public void hesapBilgileriniGoster(){ // bu method doğruluğu test etmek için tanımlanmıştır
        System.out.println("Hesap bilgileri");
        for(BankaHesabi b:hesaplar){
            
               System.out.println(b.toString()); 
            
            }
        System.out.println();
        System.out.println();
    }   
        
        public void krediKartiBilgileriniGoster(){ // bu method doğruluğu test etmek için tanımlanmıştır
        System.out.println("Kredi kartı bilgileri bilgileri");
        for(KrediKarti b:krediKartlari){
            
               System.out.println(b.toString()); 
            
            }
        System.out.println();
        System.out.println();
    }   
    
     
    
    @Override
        public String toString(){
            
            return(super.toString()+" musteriNumarasi:"+ musteriNumarasi +"\n");               
        }
    
}
