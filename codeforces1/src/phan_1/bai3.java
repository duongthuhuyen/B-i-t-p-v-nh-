package phan_1;

import java.util.Scanner;

public class bai3 {
    static int n;
    static int array[][]= new int[n][];
    static double khoangCach(int x1,int y1,int x2,int y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }
    static void max(double arr[],int k){
        double m = arr[0];
        for(int i = 1;i<k;i++){
            if(arr[i]<m){
                m= arr[i];
            }
        }
        for(int i = 1;i<k;i++){
            if(arr[i]==m){
                System.out.printf("%d %.3f",i+1,m);
                break;
            }
        }
        if(k == 1){
            System.out.println("1 0.000");
        }
    }
    static void timBKMin(){
        double kc[] = new double [n];
        int dem =0;
        for(int i = 0;i<n;i++){
            double s =  0;
            for(int j = 0;j<n;j++){

                if(j!=i) {
                    s+= khoangCach(array[i][0], array[i][1], array[j][0], array[j][1]);
                }
            }
            kc[dem] = s;
            dem++;
        }
       // System.out.println(kc[0]+" "+dem);
        max(kc,dem);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array=new int[n][2];
        for(int i = 0;i<n;i++){
            array[i][0]= sc.nextInt();
            array[i][1]=sc.nextInt();
        }
        timBKMin();
    }
}
