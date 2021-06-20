import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        float s = 1;
        for(int i=1;i<=n;i++)
        {
            int t=1;
            int ti =1;
            for(int j=1;j<=2*i+1;j++){
                t*=x;
                ti*=j;
            }

            s+=(float) t/ti;
        }
        System.out.println(s);
    }
}
