package kythuatdem;

import java.util.Scanner;

public class bai217 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static int dem(int a[]){
        int dem = 0;
        for(int i = 0;i<n;i++){
            if(a[i] > 0 && a[i]%7 == 0){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("Số lượng số dương chia hết cho 7 : "+dem(a));
    }
}
