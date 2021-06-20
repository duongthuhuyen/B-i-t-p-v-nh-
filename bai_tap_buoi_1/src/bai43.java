import java.util.Scanner;

public class bai43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        while(x>0){
            int a = x%10;
            x /=10;
            k++;
        }
        System.out.print(k);
    }
}
