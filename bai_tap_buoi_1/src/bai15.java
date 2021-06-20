import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int x = sc.nextInt();
        float s = 0;
        for(int i=1;i<=n;i++)
        {
            int t=0;
            for(int j=1;j<=i;j++){
                t+=j;
            }
            s+=(float) 1/t;
        }
        System.out.println(s);
    }
}
