package tugas3;
public class Node <T> {
    Mahasiswa data;
    Node<Mahasiswa> next,prev;

    public Node() {
        next = null;
        data = null;
    }

    public Node(Node<Mahasiswa> prev ,Mahasiswa data, Node<Mahasiswa> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
