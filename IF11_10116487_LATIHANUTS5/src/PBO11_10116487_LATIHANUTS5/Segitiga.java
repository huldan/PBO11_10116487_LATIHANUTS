package PBO11_10116487_LATIHANUTS5;

/**
 *
 * @author huldan
 */
public class Segitiga implements BangunDatar {
    int luas, keliling;
    
    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCd = 70;
    final int alas = 100;
    final int tinggi = 120;
    
    public void hitungluas(){
    luas  = (int)(0.5*alas*tinggi);
        System.out.println("luas Segitiga : " +luas);
    
    }
    
    public void hitungkeliling(){
    keliling = sisiAb+sisiBc+sisiCd;
        System.out.println("keliling Segitiga :" +keliling);
    }
   
    
}
