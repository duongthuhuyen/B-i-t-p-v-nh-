package kythuattinhtong;

import java.util.Scanner;

public class bai215 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static float tinhTrungBinh(int a[]){
        int s = 0;
        int dem = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                s+= Math.abs(a[i]-a[j]);
                dem ++;
            }
        }
        return (float) s/dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("TBC : "+tinhTrungBinh(a));
    }
}
