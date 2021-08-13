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
public class BankaPersoneli extends Kisi {
    private final int personelID;
    private ArrayList <Musteri>musteriler;
    
    public BankaPersoneli(String ad,String soyad,String email,double telefonNumarasi,int personelID){
        super(ad, soyad, email,telefonNumarasi);
        this.personelID=personelID;
        musteriler=new ArrayList<Musteri>();
        
}
    public int personelid(){      //random personal      
            int personelid=(int)(Math.random()*100);
            
            return personelid;
        }
    
    public void musteriEkle(Musteri a){
            musteriler.add(a);                      
        }
    
    public void musterileriGoster(){ // bu method doğruluğu test etmek için tanımlanmıştır
        System.out.println("Butun musterilerimiz ve bilgileri");
        for(Musteri b:musteriler){
               
               System.out.println(b.toString()); 
               
            }
        System.out.println();
        System.out.println();
    }   
    public String musterileridondur(){
        String a="";
        String c="";
        for(Musteri b:musteriler){
               
               c=b.toString();
               a=a+c;
            }
        
        
        return a;
    }
    
    @Override
    public String toString(){
    
        return(super.toString() +"\n personel numarasi:" + personelID);
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}