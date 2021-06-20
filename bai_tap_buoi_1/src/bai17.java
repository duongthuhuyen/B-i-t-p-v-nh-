import java.util.Scanner;

public class bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        float s = 0;
        for(int i=1;i<=n;i++)
        {
            int t=1;
            int ti =1;
            for(int j=1;j<=i;j++){
                t*=x;
                ti*=j;
            }

            s+=(float) t/ti;
        }
        System.out.println(s);
    }
}
