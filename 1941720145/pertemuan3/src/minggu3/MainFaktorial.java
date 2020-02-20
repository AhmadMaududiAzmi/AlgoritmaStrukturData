package minggu3;
import java.util.Scanner;
public class MainFaktorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("==============================================");
        System.out.print("Masukan jumlah elemen yang ingin dihitung: ");
        int elemen = in.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = in.nextInt();
        }
        
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Brute Force");
        for (int i=0; i<elemen; i++) {
            System.out.println("Faktorial dengan nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("==============================================");
        System.out.println("Hasil faktorial dengan Divide and Conquer");
        for (int i=0; i<elemen; i++) {
            System.out.println("Faktorial dengan nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("==============================================");
    }
}
