package t;

public class test {
    static animal a1[] = null;
    static final int a = 1;
    static final int b = 1;

    public static void main(String[] args) {
        a1 = new animal[2];
        a1[1] = new dog();
        a1[1].run();

        System.out.println(a+" "+b);
    }
}
