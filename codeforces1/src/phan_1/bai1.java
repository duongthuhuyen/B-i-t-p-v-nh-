package phan_1;

import java.util.Scanner;

public class bai1 {
    static double array1[] ;
    static double array2[] ;
    static int n;

    public static void mangcon(double array1[],double array2[]){
        int k = 0;
        for(int i = 0;i<n-1;i++){
            double s = array1[i];
            for(int j = i+1;j<n;j++){
                s+= array1[j];
                array2[k]=(s/(double) (j-i+1));
                k++;
            }
        }


        double max = array2[0];
        double min = max;
        for(int i = 1;i<k;i++){
            if(array2[i]>max){
                max = array2[i];
            }
            if(array2[i]<min){
                min = array2[i];
            }
        }
        System.out.printf("%.3f %.3f",min,max);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array1= new double[n];
        array2= new double[n*(n-1)/2];
        for(int i = 0;i<n;i++){
            array1[i]= sc.nextDouble();
        }
        mangcon(array1,array2);
    }

}
