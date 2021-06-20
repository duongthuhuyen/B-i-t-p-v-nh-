import java.util.Scanner;

public class bai7 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        float s =0;
        for(int i=1;i<=n;i++){
            s+=(float) i/(i+1);
        }
        System.out.println(s);
    }
}
