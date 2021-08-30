package Collection.Map.vd1;

import java.util.HashMap;
import java.util.Map;

public class vd {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        // giả sử ta có 1 key có 2 giá trị key : 1 value "huyen","a".
        // thì khi nó get giá trị tại key bằng 1 , nó sẽ trả vè gt sau cùng (a)
        map.put(1,"huyen");
        map.put(2,"hang");
        map.put(1,"a");
        System.out.println(map.get(1));
    }


}
