import java.util.Scanner;

public class bai117 {
    public static int tong(int n,int x){
        int a =1;
        int s = 0;
        for(int i = 1;i <= n;i++){
            a*=x;
            s+=a;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("Tong là : "+tong(n,x));
    }
}
