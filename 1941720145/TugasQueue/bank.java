public class bank {
    int max=0,size=0,front,rear;
    String nama[];
    String noRek[];
    public bank(int maks){
        max=maks; 
        create();
    }
  public void create(){     
      size =0;
      front=rear=-1;
      nama=new String[max];
      noRek=new String[max];
    }
    public boolean IsEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean IsFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen depan : ");
            System.out.println("Nama nasabah : "+nama[front]);
            System.out.println("No Rekening : "+noRek[front]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void print(){
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            
            System.out.println("=====================================");
            int i=front;
            while(i!=rear){
                System.out.println(i+". Nama : "+nama[i]);
                System.out.println("  No Rekening : "+noRek[i]);
                System.out.println("=====================================");
                
                i=(i+1)%max;
            }
            System.out.println(i+". Nama : "+nama[i]);
            System.out.println(" No rekening : "+noRek[i]);
            System.out.println("=====================================");
            System.out.println("Jumlah antrian = "+size);
        }
    }
    public void enqueue(String data1,String data2){
        if(size==max){
            System.out.println("Antrian sudah penuh");
        }else{
            if(IsEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }
            }
            nama[rear]=data1;
            noRek[rear]=data2;
            size++;
        }
    }
    public String dequeue(){
        String data=null;
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            data=nama[front];
            size--;
            if(IsEmpty()){
                front=rear=-1;
            }else{
                if(front==max-1){
                    front=0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekRear(){
       if(!IsEmpty()){
            System.out.println("Elemen terbelakang : ");
            System.out.println("Nama nasabah : "+nama[rear]);
            System.out.println("No Rekening : "+noRek[rear]);
        }else{
            System.out.println("Antrian masih kosong");
        } 
    }
     public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. enqueue");
        System.out.println("2. dequeue");
        System.out.println("3. print");
        System.out.println("4. peek");
        System.out.println("5. peekRear");
        System.out.println("6. peekPosition");
        System.out.println("7. printNasabah");
        System.out.println("------------------------------------");
    }
    public void peekPosition(String data){
       int p=-1; 
       for(int i=0;i<nama.length;i++){
           if(data.equalsIgnoreCase(nama[i])){
               p=i;
           }
       }
       if(p!=-1){
           System.out.println(data+" Berada diposisi : "+p);
       }
       else{
           System.out.println("Data tidak ditemuan!");
       }
    }
    public void printNasabah(int position){
        System.out.println("Data yang berada di posisi "+position+" adalah ");
        System.out.println("Nama nasabah : "+nama[position]);
            System.out.println("No Rekening : "+noRek[position]);
    }

}
