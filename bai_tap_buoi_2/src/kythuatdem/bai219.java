package kythuatdem;

import java.util.Scanner;

public class bai219 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static int demtanxuat (int a[],int x){
        int dem = 0;
        for(int i = 0;i<n;i++){
            if(a[i] == x){
                dem++;
            }
        }
        return dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("Số tan xuat xuat hien cua  : "+demtanxuat(a,2 ));
    }
}
