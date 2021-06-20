import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i = 1;i<= Math.sqrt((double) n);i++){
            if(n%i==0){
               s+=2;
            }
        }
        if(Math.sqrt((double) n)*Math.sqrt((double) n)== n){
            s-=1;
        }
        System.out.print(s);
    }
}
