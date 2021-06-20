import java.util.Scanner;

public class bai37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = Math.sqrt(2);
        if(n>=3){
        for (int i =3;i<=n;i++){

            double m = Math.pow((double) i+s,(double) 1/i);
            s = m;
        }
        System.out.print(s);}
    }
}
