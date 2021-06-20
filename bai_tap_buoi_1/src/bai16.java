import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        float s = 0;
        for(int i=1;i<=n;i++)
        {
            int t=0;
            int ti =1;
            for(int j=1;j<=i;j++){
                t+=j;
                ti*=x;
            }

            s+=(float) ti/t;
        }
        System.out.println(s);
    }
}
