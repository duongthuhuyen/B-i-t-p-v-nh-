import java.util.Scanner;

public class bai51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = x%10;
        while(x>0){
            int a= x%10;
            if(k<a){
                k=a;
            }
            x /=10;

        }
        System.out.print(k);
    }
}
