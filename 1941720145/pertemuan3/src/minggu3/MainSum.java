package minggu3;
import java.util.Scanner;
public class MainSum {
    public static void main(String args[]) {
        Scanner us = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("Program menghitung keuntungan total (Satuan Juta)");
        System.out.print("Masukan jumlah bulan: ");
        int bulan = us.nextInt();
        
        Sum sm = new Sum(bulan);
        System.out.println("================================");
        for (int i=0; i<sm.elemen; i++) {
            System.out.println("Masukan untung bulan ke-" + (1+i) + " = ");
            sm.keuntungan[i] = us.nextDouble();
        }
        
        System.out.println("================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
    }
}
