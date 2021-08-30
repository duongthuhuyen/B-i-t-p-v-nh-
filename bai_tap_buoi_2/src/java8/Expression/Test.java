package java8.Expression;
import java.util.Arrays;
import java.util.List;
public class Test {
    public static void main(String[] args) {
        //QuerIMPy query1 = sqlFactory.notEqual("name","duong huyen");
        //System.out.println(query1.getCondition());
        Query query = sqlFactory.equal("userName", "sondx");
        Query query1 = sqlFactory.equal("password", "123456");
        Query query2 = sqlFactory.lt("age1", 18);
        Query query3 = sqlFactory.gt("age", 30);
        List<Query> queries = Arrays.asList(query, query1, query2, query3);
        Query query4 = sqlFactory.and(queries);
        sqlBuilder sqlBuilder = new sqlBuilder(query4);
        System.out.println(sqlBuilder.query(sqlSuport.SELECT));
    }
}
