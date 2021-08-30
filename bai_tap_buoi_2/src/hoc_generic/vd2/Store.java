package hoc_generic.vd2;

import java.util.ArrayList;

public class Store {
    public static <E> E getFirstElemen(ArrayList<E> arr){
        if(arr.isEmpty()){
            return null;

        }
        E first = arr.get(0);
        return first;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(Store.getFirstElemen(list));
    }

}
