package java8.Expression;

//import DoubleLinkedList.List;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class QuerIMPy implements Query{
    private String attribute;
    private Object value;
    private final String condition;
    private final List<String> attributes = new ArrayList<>();
    private final Map<String,Object> values = new HashMap<>();

    public QuerIMPy(String attribute, Object value, Expresion expresion) {
        this.attribute = attribute;
        this.value = value;
        this.condition = attribute+expresion.operator()+" :"+attribute;
        this.attributes.add(attribute);
        this.values.put(attribute,value);
    }

    public QuerIMPy(String condition, List<String> attributes, Map<String,Object> valuess) {

        this.condition = condition;
        this.attributes.addAll(attributes);
        //this.values.addAll(values);
        this.values.putAll(valuess);
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String attribute() {
        return this.attribute;
    }

    @Override
    public Object value() {
        return this.value;
    }

    @Override
    public String condition() {
        return this.condition;
    }

    @Override
    public List<String> attributes() {
        return this.attributes;
    }

    @Override
    public Map<String,Object> values() {
        return this.values;
    }

}
