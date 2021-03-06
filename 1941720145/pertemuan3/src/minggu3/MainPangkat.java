package minggu3;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String args[]) {
        Scanner up = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.print("Masukan jumlah elemen yang ingin dihitung: ");
        int elemen = up.nextInt();
        
        Pangkat [] png = new Pangkat[elemen];
        for (int i=0; i<elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            png[i].nilai = up.nextInt();
            System.out.print("Masukan nilai pemangkat ke-" + (i+1) + " : ");
            png[i].pangkat = up.nextInt();
        }
        
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i=0; i<elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Divide amd Conquer");
        for (int i=0; i<elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("==============================================");
    }
}
