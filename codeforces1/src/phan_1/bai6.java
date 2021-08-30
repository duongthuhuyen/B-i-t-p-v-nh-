package phan_1;

import java.util.Scanner;

public class bai6 {
    static int phandu(int n,int k){
        if(n==1){
            return 1;
        }
        return (phandu(n-1,k)+k-1)%n+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int k = sc.nextInt();
        int b = phandu(n,s);
        System.out.println(b);
        //int b = n-k;
        //int c = s+1;
        int c = k-b;
        if(c>=0){
            System.out.println(1+c);
        }else{
            System.out.println(n+1+c);
        }

        //System.out.println(c);
    }
}
