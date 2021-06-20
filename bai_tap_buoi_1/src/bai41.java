import java.util.Scanner;

public class bai41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int x = sc.nextInt();
        double s = 1;

        for (int i =1;i<=n;i++){

                double m =1/(1+s);
                s =m;
        }
        System.out.print(s);
    }
}
