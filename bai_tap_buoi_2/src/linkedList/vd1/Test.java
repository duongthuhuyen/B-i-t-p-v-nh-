package linkedList.vd1;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addHead(1);
       list.addHead(2);
       list.addHead(3);
        list.addTail(4);
       //list.add(2,1);
        list.print();
        list.removeHead(1);
        list.print();
    }
}
