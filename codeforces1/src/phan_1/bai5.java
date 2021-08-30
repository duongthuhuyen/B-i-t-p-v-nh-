package phan_1;

import java.util.Scanner;

public class bai5 {
    static int n;
    static int array[];
    static void max(int arr[],int k){
        int ma = arr[0];
        for(int i = 1;i<k;i++){
            if(ma>arr[i]){
                ma = arr[i];
            }
        }
        System.out.println(ma);

    }
    static void timMax(){
        int arr [] = new int[n];
        int dem = 0;
        for(int i = 0;i<n;i++){
            int s = array[i];
            int min = array[i];
            int j = (i+1)%n;
            while (i!=(j%n)){
                s = s+array[j%n];
               // System.out.println(s);
                if(s<min){
                    min = s;
                }
                j++;
              //  System.out.println(min);
            }
          //  System.out.println(min);
            arr[dem ]=min;
            dem++;
        }
        max(arr,dem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        for(int i = 0;i<n;i++){
            array[i]= sc.nextInt();
        }
        //input(n);
        timMax();
    }
}
