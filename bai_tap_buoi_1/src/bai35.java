import java.util.Scanner;

public class bai35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = Math.sqrt((double) n);
        for (int i =n-1;i>=1;i--){
            double m = Math.sqrt((double) i+s);
            s = m;
        }
        System.out.print(s);
    }
}
