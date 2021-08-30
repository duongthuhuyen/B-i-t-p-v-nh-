package Expression_lamda;

public interface Expression {
    String getCondition();

    static String equal(){
        return "=";
    }
    static String notEqual(){
        return "<>";
    }
    static String tl(){
        return "<";
    }
    static String tle(){
        return "<=";
    }
    static String tr(){
        return ">";
    }
    static String tre(){
        return ">=";
    }
}
