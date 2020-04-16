import java.util.Scanner;
public class QueueMain {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian : ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih = 0;
        do{
            Q.menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan: "+ dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();;
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.println("Data yang ingin dicari :");
                    int data = sc.nextInt();
                    Q.peekPosition(data);
                    break;
                case 7:
                System.out.println("Data yang berada di posisi :");
                int posisi=sc.nextInt();
                Q.peekAt(posisi);
                break;
            }
        }
        while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih==5 || pilih==6 || pilih==7);
    }
}
