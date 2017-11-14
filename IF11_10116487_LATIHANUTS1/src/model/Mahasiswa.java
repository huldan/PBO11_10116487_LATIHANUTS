package model;

/**
 *
 * @author huldan
 */
public class Mahasiswa {
    String nim,nama;

    public Mahasiswa(String nama,String nim) {
    this.nama = nama;
    this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
    
}
