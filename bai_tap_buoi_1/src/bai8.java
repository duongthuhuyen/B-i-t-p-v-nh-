import java.util.Scanner;

public class bai8 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        float s =1/2;
        for(int i=1;i<=n;i++){
            s+=(float) (2*i+1)/(2*i+2);
        }
        System.out.println(s);
    }
}
