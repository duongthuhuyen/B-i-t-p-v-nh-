package java8.Expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class sqlFactory {
    public static Query equal(String attribute, Object value){
        return new QuerIMPy(attribute,value,Expresion::equal);
    }

    public static Query notEqual(String attribute, Object value){
        return new QuerIMPy(attribute,value,Expresion::notEqual);
    }

    public static Query gt(String attribute, Object value){
        return new QuerIMPy(attribute,value,Expresion::gt);
    }

    public static Query gte(String attribute, Object value){
        return new QuerIMPy(attribute,value,Expresion::gte);
    }

    public static Query lt(String attribute, Object value){
        return new QuerIMPy(attribute,value,Expresion::lt);
    }

    public static Query lte(String attribute, Object value){
        return new QuerIMPy(attribute,value,()->Expresion.lte());
    }

    public static Query and(List<Query> queries){
        List<Query> queries1 = new ArrayList<>();
        for(Query query:queries){
            if(query != null) {
                queries1.add(query);
            }
        }
        Predicate<List<Query>> predicate = List::isEmpty;
        if(predicate.test(queries1)){
            return null;
        }
        List<String> conditions = new ArrayList<>();
        List<String> attributes = new ArrayList<>();
        Map<String,Object> values = new HashMap<>();
        for(Query query :queries){
            conditions.add(query.condition());
            attributes.add(query.attribute());
            values.put(query.attribute(),query.value());
        }
        String condition = String.join(" AND ",conditions);
        return new QuerIMPy(condition,attributes,values);
    }

}
