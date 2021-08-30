import java.util.Scanner;

public class bai141 {
    public static void input(float a[],int n ){
        Scanner sc = new Scanner(System.in);
        //System.out.println("n = ");
        //n =sc.nextInt();
        for(int i=0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i]= sc.nextFloat();
        }
    }
    public static void output(float a[],int n){
        for(int i=0;i<n;i++ ){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int Timvitriminduong(float[] a, int n){
        float m = -1;
        int j = -1;
        for(int i = 0 ;i<n;i++){
            if(a[i]>0){
                m =a[i];
                j = i;
                break;
            }
        }
        int k =j;
        for(int i= j+1;i<n;i++ ){
            if(a[i]>0 && a[i]<m){
               m = a[i];
               k = i;
               System.out.println(k);
            }
        }
        return k;
       //return b;
        //System.out.println();
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        // System.out.println("Tổng các số thực trong mảng là : "+tong(a,n));
        // lietkecacsoam(a,n);
        // output(a,n);
        System.out.println("vị trí số dương nhỏ nhất của mảng : "+Timvitriminduong(a,n));
        //Timvitriminduong(a,n);
    }
}
