package DoubleLinkedList;

public class doubleLinkedList<T> implements List<T>{
    private int length;
    private Node<T> head;
    private  Node<T> tail;

    public doubleLinkedList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }


    @Override
    public boolean addHead() {
        return false;
    }

    @Override
    public boolean addTail() {
        return false;
    }

    @Override
    public boolean removeHead() {
        return false;
    }

    @Override
    public boolean removeTail() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
