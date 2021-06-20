import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<= Math.sqrt((double) n);i++){
            if(n%i==0){
                System.out.print(i+" "+n/i+" ");
            }
        }
    }
}
