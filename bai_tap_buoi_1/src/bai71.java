import java.util.Scanner;

public class bai71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double x  = sc.nextDouble();
        double s = 0;
        int k=1;

        for(int i  = 1;i<= n;i++){
            //int k =0;
            /*for(int j = 1;j<=i;j++){
                k+=j;
            }*/
            s+= (double) Math.pow(-1,i)*Math.pow(x,(double) (i))/k;
            k=k+i+1;
        }
        System.out.print(s);
    }
}
