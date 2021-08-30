package java8.Expression;

import java.util.List;
import java.util.Map;

public class sqlBuilder {
    private Query query;

    public sqlBuilder(Query query) {
        this.query = query;
    }

    public String query(String rootBuilder){
        StringBuilder sqlBuilder = new StringBuilder(rootBuilder);
        if(query.condition() != null && !query.condition().isEmpty()){
            sqlBuilder.append(query.condition());
        }
        String sql = sqlBuilder.toString();

        List<String> attri = query.attributes();
        Map<String,Object> map = query.values();
        if(map!=null && !map.isEmpty()) {
            if (attri != null && !attri.isEmpty()) {
                for(String atr:attri){
                    Object value = map.get(atr);
                    if(value != null){
                        sql = sql.replace(":"+atr, String.valueOf(value));
                    }
                }
            }
        }
        return sql;

    }
}
