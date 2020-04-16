public class Queue {
    int max, size, front, rear;
    int Q[];
    public Queue(int n){
        max = n;
        create();
    }
    public void create(){
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        }else {
            return false;
        }
    }
    public boolean IsFull(){
        if(size == max - 1){
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan: "+Q[front]);
        }else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void print(){
        if (IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            int i = front;
            while (i != rear){
                System.out.println(Q[i] +" ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i]+"");
            System.out.println("Jumlah antrian : "+size);
        }  
    }
    public void Enqueue(int data){
            if(IsFull()){
                System.out.println("Antrian sudah penuh");
            }else{
                if (IsEmpty()){
                    front = rear = 0;
                }else{
                    if(rear == max - 1){
                        rear = 0;
                    }else {
                        rear++;
                    }
                }
                Q[rear] = data;
                size++;
            }
        }
    public int dequeue(){
        int data = 0;
        if(IsEmpty()){
            System.out.println("Antrian masih kosong");
        }else{
            data = Q[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }else{
                if(front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }
    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : "+Q[rear]);
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void peekPosition(int data){
        int p=-1;
        for(int i=0; i<Q.length; i++){
            if(data==Q[i]){
                p=i;
            }
        }
        if(p!=-1){
            System.out.println(data+" berada diposisi : "+p);
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
    public void peekAt(int position){
        System.out.println("Data yang berada di posisi "+position+" adalah "+Q[position]);
    }
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. peekPosition");
        System.out.println("7. peekAt");
        System.out.println("----------------------------------");
    }
    }
