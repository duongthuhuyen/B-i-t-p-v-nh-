import java.util.Scanner;

public class bai62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

            while (a != b) {
                if (a > b) {
                    a = a - b;
                }
                if (b > a) {
                    b = b - a;
                }
            }
            System.out.print(a);


    }
}
