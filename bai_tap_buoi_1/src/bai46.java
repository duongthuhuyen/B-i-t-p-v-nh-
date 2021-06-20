import java.util.Scanner;

public class bai46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        while(x>0){
            int a = x%10;
            if(a%2 ==1){
                k++;
            }
            x /=10;

        }
        System.out.print(k);
    }
}
