import java.util.Scanner;

public class bai10 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int s =1;
        for(int i=1;i<=n;i++){
            s*=x;
        }
        System.out.println(s);
    }
}
