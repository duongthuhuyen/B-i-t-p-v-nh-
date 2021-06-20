import java.util.Scanner;

public class bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 1;
        for (int i =2;i<=n;i++){
            int t = 1;
            for(int j = 1;j<=i;j++){
                t*=j;
            }
            double m = Math.sqrt((double) t +s);
            s = m;
        }
        System.out.print(s);
    }
}
