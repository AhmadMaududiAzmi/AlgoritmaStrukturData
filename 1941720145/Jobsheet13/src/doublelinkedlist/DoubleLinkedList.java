package doublelinkedlist;
public class DoubleLinkedList {
    Node head;
    int size;
    
    public DoubleLinkedList() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node (null, item, null);
        } else {
            Node newNode = new Node (null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node (current, item, null);
            current.next =  newNode;
            size++;
        }
    }
    
    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception ("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(null, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        head = null;
        size = 0;
    }
    
    public void print() {
        if(!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\tBerhasil diisi");
        } else {
            System.out.println("Linked List kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if(size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception ("Linked List masih kosong, tidak dapat dihapus");
        } else if(head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    
    public void remove(int index) throws Exception {
        if(isEmpty() || index>=size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if(index==0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if(current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public int getFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
    
    public int getLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public int get(int index) throws Exception {
        if(isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } 
        Node tmp = head;
        for (int i=0; i<index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public void getPcc(int data) throws Exception {
        if (isEmpty()) {
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (tmp.data == data) {
                index = i;
                System.out.println("Data ditemukan di index ke-" + index);
            }
            index = 99;
            tmp = tmp.next;
        }
        if (index == 99) {
            System.out.println("Data tidak tersedia");
        }
    }

    public int[] addArr() {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }
        Node tmp = head;
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (tmp != null) {
                arr[i] = tmp.data;
            }
            tmp = tmp.next;
        }
        return arr;
    }

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
    }
    
    public void mergeProses(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        for(int i=0;i<n1; i++){
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[1 +m +j];
        }
        
        int x = 0, y = 0;
        int k = l;
        while(x < n1 && y< n2){
            if(L[x] <= R[y]){
                arr[k] = L[x];
                x++;
            }else{
                arr[k] = R[y];
                y++;
            }
            k++;
        }
        
        while(x < n1){
            arr[k] = L[x];
            x++;
            k++;
        }
        
        while(y < n2){
            arr[k] = R[y];
            y++;
            k++;
        }
    }
    
    public void mergeSort(int arr[], int l, int r){
        if(l < r){
            int m = (l+r)/ 2;
            
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            
            mergeProses(arr, l, m, r);
        }
    }

    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

