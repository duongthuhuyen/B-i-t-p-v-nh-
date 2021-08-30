package linkedList.vd1;

public class LinkedList<T> implements List<T>{

    private Node<T> head;// con tro chi den phan tu dau
    private Node<T> tail;// con tro chi den phan tu cuoi
    private int length;

    public LinkedList() {
        this.head= null;
        this.tail= null;
        this.length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean addHead(T t) {
        Node<T> node = new Node<>(t);
       // node.setData(t);
        if (isEmpty()){
            this.head = node;
            this.tail= node;
            //this.tail.setNext(null);
            this.length++;
            return true;
        }
        node.setNext(this.head);
        this.head = node;
        this.length++;
        return false;
    }

    @Override
    public boolean addTail(T t) {
       // return false;
        Node<T> node = new Node<>(t);
        if(isEmpty()){
            this.head = node;
            this.tail= node;
            this.length++;
            return true;
        }
        this.tail.setNext(node);
        this.tail = node;
        this.length++;
        return false;
    }

    @Override
    public boolean add(T t1,T t2) {

        Node<T> node = find(t1);
        Node<T> node1 = new Node<>(t2);
        node1.setNext(node.getNext());
        node.setNext(node1);
        this.length++;
        return true;
    }

    @Override
    public boolean removeHead(T t) {
        if(length== 0 ) {
            return false;
        }
        Node<T> node = this.head;
        this.head = node.getNext();
        node = null;
        this.length--;
        return true;

    }

    @Override
    public boolean removeTail(T t) {
        Node<T> node = this.head;
        while (node.getNext().getNext()!= null){
            node = node.getNext();
        }
        this.tail = node;
        node.setNext(null);
        this.length--;
        return true;
    }

    @Override
    public boolean remove(T t) {
        return false;
    }

    @Override
    public Node<T> find(T data) {
        Node<T> node = this.head;
        while (node!=null){
            if(node.getData().equals(data)){
              //  return node;
                break;
            }
            node.setNext(node);
        }
        //return true;
        return node;
    }

    @Override
    public void print() {
        Node<T> node = this.head;
        while (node!= null){
            System.out.print(node.getData()+" ");
            node= node.getNext();
        }
    }
}
