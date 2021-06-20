import java.util.Scanner;

public class bai5 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        float s =1;
        for(int i=1;i<=n;i++){
            s+=(float) 1/(2*i+1);
        }
        System.out.println(s);
    }
}
