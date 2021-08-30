package DoubleLinkedList;

public class Node <T>{
    private T data;
    private Node pre;
    private Node next;

    public Node(T t) {
        this.data =t ;
        this.pre=null;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
