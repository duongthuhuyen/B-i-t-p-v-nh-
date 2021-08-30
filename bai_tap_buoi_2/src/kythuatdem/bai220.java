package kythuatdem;

import java.util.Scanner;

public class bai220 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static int demsoChan(int a[]){
        int dem = 0;
        for(int i = 0;i<n;i++){
            if(a[i]%10 == 5){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("Số lượng số chẵn trong mảng : "+demsoChan(a));
    }
}
