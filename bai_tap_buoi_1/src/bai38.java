import java.util.Scanner;

public class bai38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 1;

            for (int i =2;i<=n;i++){

                double m = Math.pow((double) i+s,(double) 1/(i+1));
                s = m;
            }
            System.out.print(s);
    }
}
