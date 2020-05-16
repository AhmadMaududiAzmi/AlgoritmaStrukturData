package PersewaanCD;
import java.util.Scanner;
public class MainProgram {
       public static void main(String[] args) throws Exception {
        Scanner id = new Scanner(System.in);
        id.useDelimiter("\n");
        DoubleLinkedList dl = new DoubleLinkedList();

        int pilihan;

        do {
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = id.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("1. CD masuk");
                    System.out.print("=========================================");
                    System.out.print("Kode \t : ");
                    int s = id.nextInt();
                    System.out.print("Judul \t :");
                    String jdl = id.next();
                    System.out.print("Distributor \t :");
                    String dst = id.next();
                    System.out.print("Jumlah stok \t :");
                    int stk = id.nextInt();
                    System.out.print("Jumlah rusak \t : ");
                    int rsk = id.nextInt();
                    

                    dl.addFirst(new CD_Azmi(s, jdl, dst, stk, rsk));
                    break;
                case 2:
                    System.out.print("2. CD keluar");
                    System.out.print("=========================================");
                    System.out.print("Kode \t : ");
                    s = id.next().charAt(0);
                    System.out.print("Judul \t :");
                    jdl = id.next();
                    System.out.print("Distributor \t :");
                    dst = id.next();
                    System.out.print("Jumlah stok \t :");
                    stk = id.nextInt();
                    System.out.print("Jumlah rusak \t : ");
                    rsk = id.nextInt();
                    dl.addLast(new CD_Azmi(s, jdl, dst, stk, rsk));
                    break;
                case 3:
                    System.out.print("3. CD rusak");
                    System.out.print("=========================================");
                    System.out.print("Masukkan index CD rusak : ");
                    s = id.next().charAt(0);
                   
                    System.out.print("Masukkan posisi index: ");
                    int ind = id.nextInt();
                    
                    dl.add(new CD_Azmi(s, dt), ind);
                    break;
                case 4:
                    dl.print();
                    break;
                case 5:
                    System.out.print("Masukkan index CD: ");
                    s = id.nextInt();
                    
                    dl.getPcc(s);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan tidak sesuai");
            }
        } while (pilihan >= 1 || pilihan <= 8);
    }

    public static void menu() {
        System.out.println("1. CD masuk");
        System.out.println("2. CD keluar");
        System.out.println("3. CD rusak");
        System.out.println("4. Tampilkan semua data ");
        System.out.println("5. Cari ed");
        System.out.println("6. Keluar");
    }
}