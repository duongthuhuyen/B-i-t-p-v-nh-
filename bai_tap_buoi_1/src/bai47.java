import java.util.Scanner;

public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        while(x>0){
            int a =x%10;
            if(a%2==0){
                k+=a;
            }
          //  k+=a;
            x /=10;

        }
        System.out.print(k);
    }
}
