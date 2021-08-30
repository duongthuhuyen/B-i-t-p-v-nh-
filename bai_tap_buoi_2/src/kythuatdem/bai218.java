package kythuatdem;

import java.util.Scanner;

public class bai218 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static boolean checkdoixung(int c){
        int a = c;
        int b = 0;
        while(a>0){
            b = (b*10+a%10);
            a = a/10;
        }
        if(b == c){
            return true;
        }
        return false;
    }
    public static int demsodoixung (int a[]){
        int dem = 0;
        for(int i = 0;i<n;i++){
            if(checkdoixung(a[i])){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("Số lượng số đối xứng : "+demsodoixung(a));
    }
}
