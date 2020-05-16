package PersewaanCD;
public class Node <T> {
    CD_Azmi data;
    Node<CD_Azmi> next,prev;

    public Node() {
        next = null;
        data = null;
    }

    public Node(Node<CD_Azmi> prev ,CD_Azmi data, Node<CD_Azmi> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
