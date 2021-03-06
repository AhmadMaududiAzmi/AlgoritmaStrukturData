package tugas3;
import java.util.Scanner;
public class iniMain {

    public static void main(String[] args) throws Exception {
        Scanner id = new Scanner(System.in);
        id.useDelimiter("\n");
        DoubleLinked dl = new DoubleLinked();

        int pilihan;

        do {
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = id.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String s = id.next();
                    System.out.print("Masukkan nilai: ");
                    int dt = id.nextInt();

                    dl.addFirst(new Mahasiswa(s, dt));
                    break;
                case 2:
                    System.out.print("Masukkan nama: ");
                    s = id.next();
                    System.out.print("Masukkan nilai: ");
                    dt = id.nextInt();

                    dl.addLast(new Mahasiswa(s, dt));
                    break;
                case 3:
                   System.out.print("Masukkan nama: ");
                    s = id.next();
                    System.out.print("Masukkan nilai: ");
                    dt = id.nextInt();

                    System.out.print("Masukkan posisi index: ");
                    int ind = id.nextInt();
                    
                    dl.add(new Mahasiswa(s, dt), ind);
                    break;
                case 4:
                    dl.removeFirst();
                    break;
                case 5:
                    dl.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan posisi index: ");
                    ind = id.nextInt();
                    dl.remove(ind);
                    break;
                case 7:
                    dl.print();
                    break;
                case 8:
                    System.out.print("Masukkan nama mahasiswa: ");
                    s = id.next();
                    
                    dl.getPcc(s);
                    break;
                case 9:
                    String array[][] = new String[dl.size()][2];
                    array = dl.addArr();
                    dl.bubbleSort(array);
                    dl.printArray(array);
                    break;
                case 10:
                    String data[][] = new String[dl.size()][2];
                    data = dl.addArr();
                    dl.insertionSort(data);
                    dl.printArray(data);
                    break;
                case 11:
                    String link[][] = new String[dl.size()][2];
                    link = dl.addArr();
                    dl.mergeSort(link, 0, link.length - 1);
                    dl.printArray(link);
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
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Index Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Bubble Sort");
        System.out.println("10. Insertion Sort");
        System.out.println("11. Merge Sort");
        System.out.println("0. Keluar");
    }
}
