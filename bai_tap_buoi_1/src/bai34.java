import java.util.Scanner;

public class bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 1;
        for (int i =2;i<=n;i++){
            double m = Math.sqrt((double) i+s);
            s = m;
        }
        System.out.print(s);
    }
}
