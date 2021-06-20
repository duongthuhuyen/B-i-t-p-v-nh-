import java.util.Scanner;

public class bai40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        double s = Math.sqrt((double) x);

        for (int i =2;i<=n;i++){

            double m = Math.sqrt( Math.pow((double) x,(double) i)+s);
            s = m;
        }
        System.out.print(s);
    }
}
