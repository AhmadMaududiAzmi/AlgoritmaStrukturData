import java.util.Scanner;
public class bankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian : ");
        int n=sc.nextInt();
        bank q=new bank(n);
        int pilih = 0;
        do{
        q.menu();
            System.out.print("Pilihan : ");
        pilih=sc.nextInt();
        switch(pilih){
            case 1:
                System.out.println("Masukkan data baru");
                System.out.print("Nama : ");
                String namaBr=sc1.nextLine();
                System.out.print("No rekening : ");
                String noBr=sc1.nextLine();
                q.enqueue(namaBr,noBr);
                break;
            case 2 :
                String dataKeluar=q.dequeue();
                if(dataKeluar!=null){
                    System.out.println("Data yang dikeluarkan : "+dataKeluar);
                    break;
                }
            case 3 :
                q.print();
                break;
            case 4 :
                q.peek();
                break;
            case 5:
                q.peekRear();
                break;
            case 6:
                System.out.println("Nama data nasabah yang ingin dicari :");
                String data=sc1.nextLine();
                q.peekPosition(data);
                break;
            case 7:
                System.out.println("Data yang berada di posisi :");
                int posisi=sc.nextInt();
                q.printNasabah(posisi);
                break;
        }
        }
       while(pilih==1 || pilih==2 ||pilih==3 || pilih==4 || pilih==5 || pilih==6 || pilih==7); 
        
    }
}
