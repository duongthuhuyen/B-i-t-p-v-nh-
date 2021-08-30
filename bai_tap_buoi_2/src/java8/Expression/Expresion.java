package java8.Expression;

public interface Expresion {
    String operator();

    static String equal(){
        return " = ";
    }
    static String notEqual(){
        return " <> ";
    }
    static String gt(){
        return " < ";
    }
    static String gte(){
        return " <= ";
    }
    static String lt(){
        return " > ";
    }
    static String lte(){
        return " >= ";
    }
}
