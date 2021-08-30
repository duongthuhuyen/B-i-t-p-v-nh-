import java.util.Scanner;

public class bai157 {
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
    public static float Timmax(float a[],int n){
        float max = a[0];
        //int k=0;
        for(int i=1;i<n;i++ ){
            //System.out.print(a[i]+" ");
            if(a[i]>max){
                max = a[i];
                //k = i;
            }
        }
        // System.out.println();
        return max ;
    }
    public static float Timmin(float a[],int n){
        float min = a[0];
        //int k=0;
        for(int i=1;i<n;i++ ){
            //System.out.print(a[i]+" ");
            if(a[i]<min){
                min = a[i];
                //k = i;
            }
        }
        // System.out.println();
        return min;
    }
    public static void timkhoang(float a[],int n){
        System.out.println("Khoảng [a,b] là : ["+Timmin(a,n)+","+Timmax(a,n)+"]");
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        //System.out.println("So thuc xa x nhát : "+ sothucxaxnhat(a,n,10));
        timkhoang(a,n);
        //lietkecacsoam(a,n);
        // output(a,n);
    }
}
