package minggu5;

public class Mahasiswa {
    String nama;
    int thn_masuk,umur;
    double ipk;
    
    Mahasiswa (String n, int t, int u, double i) {
        nama = n;
        thn_masuk = t;
        umur = u;
        ipk = i;
    }
    
    void tampil () {
        System.out.println("Nama = " + nama);
        System.out.println("Tahun Masuk = " + thn_masuk);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

    public Mahasiswa() {
    }
}
