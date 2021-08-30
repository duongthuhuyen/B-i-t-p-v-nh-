package java8.lamdaexpresion;

public class Lamda {
    public static void main(String[] args) {
        Function f = (s) -> System.out.println(s);// biểu thức lamda(lamda expresion)--> là bước implement lại hàm print
        f.print("a");
    }
}
