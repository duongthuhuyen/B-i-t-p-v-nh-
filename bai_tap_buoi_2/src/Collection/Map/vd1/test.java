package Collection.Map.vd1;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"m");
        map.put(2,"w");
        map.remove(1);
        System.out.println(map);
    }

}
