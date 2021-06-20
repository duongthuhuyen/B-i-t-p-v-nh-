import java.util.Scanner;

public class bai68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double x  = sc.nextDouble();
        double s  = 0;
        for(int i  = 1;i<= n;i++){
            s+= (double) Math.pow(-1,i)*Math.pow(x,(double) (2*i));
        }
        System.out.print(s);
    }
}
