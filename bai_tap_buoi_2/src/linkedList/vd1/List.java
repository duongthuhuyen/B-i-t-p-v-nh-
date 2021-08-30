package linkedList.vd1;

public interface List <T>{
    int size();
    boolean isEmpty();
    boolean addHead(T t);
    boolean addTail(T t);
    boolean add(T t1,T t2);
    boolean removeHead(T t);
    boolean removeTail(T t);
    boolean remove(T t);

    void print();


    Node<T> find(T data);
}
