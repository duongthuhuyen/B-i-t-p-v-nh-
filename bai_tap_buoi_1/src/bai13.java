import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int s = 0;
        for(int i=1;i<=n;i++)
        {
            int t=1;
            for(int j=1;j<=2*i;j++){
                t*=x;
            }
            s+=t;
        }
        System.out.println(s);
    }
}
