package hoc_generic.vd3;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseBusiness<T> implements Business<T>{

    public static Map<String ,Business> map = new HashMap<>();

    static {
        map.put(CKConstance.BOND,new BondBusiness());
        map.put(CKConstance.FUND,new FunBusiness());
    }

    public static Business get(String key){
        return map.get(key);
    }
}
