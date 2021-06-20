import java.util.Scanner;

public class bai67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double x  = sc.nextDouble();
        double s  = 0;
        for(int i  = 1;i<= n;i++){
            s+= (double) Math.pow(-1,i+1)*Math.pow(x,(double) i);
        }
        System.out.print(s);
    }
}
