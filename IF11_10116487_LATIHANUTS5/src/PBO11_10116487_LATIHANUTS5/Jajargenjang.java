package PBO11_10116487_LATIHANUTS5;

/**
 *
 * @author huldan
 */
public class Jajargenjang implements BangunDatar {
    int luas,keliling;
    
    final int sisiAb = 50;
    final int sisiBc = 60;
    final int sisiCd = 70;
    final int sisiDa = 80;
    final int alas = 100;
    final int tinggi = 120;
    
    public void hitungluas(){
        luas = alas*tinggi;
        System.out.println("luas Jajargenjang : " +luas);
        
    
    }
    public void hitungkeliling(){
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("keliling jajargenjang :" +keliling);
    }
}
