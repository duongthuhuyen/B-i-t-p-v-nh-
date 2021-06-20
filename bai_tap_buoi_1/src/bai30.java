import java.util.Scanner;

public class bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= (int) Math.sqrt((double) n); i++) {
            if (n % i == 0) {

                //System.out.print(i+" ");
                s += i;

                if (i * i != n) {

                    //System.out.print(n/i+" ");
                    s += (n / i);

                }
                // System.out.print(i+" ");
            }
        }
        int k = s-n;
        if(k<=n){
            System.out.println(n+" là số hoàn thiện");
        }else{
            System.out.println(n+" không là số hoàn thiện");
        }
    }
}
