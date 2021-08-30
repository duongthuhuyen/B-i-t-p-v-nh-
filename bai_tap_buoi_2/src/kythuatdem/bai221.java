package kythuatdem;

import java.util.Scanner;

public class bai221 {
    private static int n;
    public static void input(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
    }
    public static int demsoChan(int a[]){
        int demchan = 0;
        int demle = 0;
        for(int i = 0;i<n;i++){
            if(a[i]%2 == 0){
                demchan++;
            }else{
                demle++;
            }
        }
        if(demchan>demle){
            return 1;
        }
        if(demchan<demle){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        n = 6;
        int a[] = new int[n];
        input(a);
        System.out.print("bài 212 : "+demsoChan(a));
    }
}
