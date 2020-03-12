package minggu5;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jmlMhs = 5;
        
        for (int i=0; i<jmlMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("Ipk = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa (nama,thn,umur,ipk);
            data.tambah(m);
        }
        
        System.out.println("Data Mahasiswa sebelum sorting");
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting (BUBBLESORTING)");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setalh sorting (SELECTIONSORTING)");
        data.selectionSort();
        data.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting (INSERTIONSORTING)");
        data.insertionSort();
        data.tampil();
                
    }
}
