package kythuatdem;

import java.util.Scanner;

public class bai226 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static int demkeChan(int a[]){
        int dem = 0;
        for(int i = 0;i<n-1;i++){
            if(a[i]%2 == 0&& a[i+1]%2 == 0){
               dem++;
               i++;
            }
        }
        return 2*dem;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("Số lượng số chẵn kề nhau trong mảng : "+demkeChan(a));
    }
}
