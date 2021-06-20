import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i = 1;i<= Math.sqrt((double) n);i++){
            if(n%i==0){
                //System.out.print(i+" "+n/i+" ");
                s+=(i+n/i);
            }
        }
        if((int) Math.sqrt((double) n)*(int) Math.sqrt((double) n)== n)
        {
            s-= Math.sqrt((double) n);
        }
        System.out.print(s);
    }
}
