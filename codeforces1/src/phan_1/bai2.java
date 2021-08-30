package phan_1;

import java.util.Scanner;

public class bai2 {
    static int array[];
    static int n;

    static void mangdanhdau(int array[],int n ){
        int array1 []= new int[n];
        int array2 [][]= new int[n][2];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(array1[i]== 0){
                int dem = 1;
                for(int j = i+1;j<n;j++){
                    if(array[i]==array[j]){
                        dem++;
                        array1[j]=1;
                    }
                }
                array2[k][0]= array[i];
                array2[k][1]= dem;
                k++;
            }
        }
        for(int i = 0;i<k-1;i++){
            for(int j = i+1;j<k;j++ ){
                if(array2[i][0]>array2[j][0]){
                    int m = array2[i][0];
                    array2[i][0]=array2[j][0];
                    array2[j][0]= m;
                    int p = array2[i][1];
                    array2[i][1]=array2[j][1];
                    array2[j][1]= p;
                }
            }
        }
        System.out.println(k);
        for(int i = 0;i<k;i++){
            System.out.println(array2[i][0]+" "+array2[i][1]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        array = new int[n];
        for(int i = 0;i<n;i++){
            array[i]= sc.nextInt();
        }
        mangdanhdau(array,n);

    }


}