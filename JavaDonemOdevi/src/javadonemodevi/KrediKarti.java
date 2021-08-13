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
public class KrediKarti {
    
    private final double kartNumarasi;
    private double limit;
    private double guncelBorc;
    private int kullanilabilirLimit;
    
    public KrediKarti(double kartNumarasi,double limit,double guncelBorc,int kullanilabilirLimit){   
        this.kartNumarasi=kartNumarasi;
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        this.kullanilabilirLimit=kullanilabilirLimit;
    
}
    
    public double randomkartnumarasi(){
        double randomnumara=(int) Math.ceil(Math.random() * 10000000)+100000;
        return randomnumara;
    }
    
    public void setlimit(double limit){
    
        this.limit=limit;
    
    }
    
    public double getlimit(){
    
        return limit;
    
    }
    
    public void setguncelBorc(double guncelBorc){
    
        this.guncelBorc=guncelBorc;
    
    }
    
    public double getguncelBorc(){
    
        return guncelBorc;
    
    }
    
    public void setkullanilabilirLimit(int kullanilabilirLimit){
    
        this.kullanilabilirLimit=kullanilabilirLimit;
    
    }
    
    public int getkullanilabilirLimit(){
    
        return kullanilabilirLimit;
    
    }
    
    
    
    
    
    
    @Override
        public String toString(){
            
            return(super.toString()+"\n kart numarasi:"+ kartNumarasi + "\n limit:"+ limit+ "\n guncelBorc:"+ guncelBorc+ "\n kullanilabilirLimit:"+ kullanilabilirLimit);               
        }
}

  
        