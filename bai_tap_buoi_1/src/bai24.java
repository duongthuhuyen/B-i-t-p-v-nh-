import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1;i<= Math.sqrt((double) n);i++){
            if(n%i==0){

                if(i%2 == 1){
                    System.out.print(i+" ");
                }
                if(i*i != n){
                if((n/i)%2 ==1){
                    System.out.print(n/i+" ");
                }}


               // System.out.print(i+" ");
            }
        }
        //System.out.print(s);
    }
}
