package Collection.List.vd1;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<Integer> inteders = new ArrayList<>();
        inteders.add(4);
        inteders.add(2);
        inteders.add(3);
// Iterator để duyệt các phần tử của collection
        //Iterator i=inteders.iterator();
        //Iterator i = inteders.listIterator();
        // while (i.hasNext()){
        //      System.out.println(i.next());}

        /*/
        Cach 2
         */
        //inteders.forEach(integer -> System.out.println(integer));
        ///

        int size = inteders.size();
        inteders.sort((a1,a2)->a2.compareTo(a1));

        inteders.forEach(integer -> System.out.println(integer));
        int x = Collections.binarySearch(inteders, 2);
        //inteders.forEach(i-> System.out.println(i));
        // Collections.binarySearch --> trả về vị trí của một đối tượng trong danh sách đã sắp xếp
        System.out.println(x);

    }
}

