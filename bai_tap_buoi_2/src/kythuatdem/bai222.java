package kythuatdem;

import java.util.Scanner;

public class bai222 {
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
        for(int i = 1;i<n-1;i++){
            if(a[i]>a[i-1]&&a[i]>a[i+1]){
                dem++;
            }
            if(a[i]<a[i-1]&&a[i]<a[i+1]){
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
