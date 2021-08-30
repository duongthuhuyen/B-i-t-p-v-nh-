package java8.Expression;

import java.util.List;
import java.util.Map;

public interface Query {
    String attribute();
    Object value();
    String condition();
    List<String> attributes();
    Map<String,Object> values();
}
