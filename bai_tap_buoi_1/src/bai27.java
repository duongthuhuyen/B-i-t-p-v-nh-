import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= (int) Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    //System.out.print(i+" ");
                    s ++;
                }
                if (i * i != n) {
                    if ((n / i) % 2 == 0) {
                        //System.out.print(n/i+" ");
                        s++;
                    }
                }
                // System.out.print(i+" ");
            }
        }
        System.out.print(s);
    }
}
