import java.util.Scanner;

public class bai48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 1;
        while(x>0){
            int a = x%10;
            if(a%2 ==1){
                k*=a;
            }
            x /=10;

        }
        System.out.print(k);
    }
}
