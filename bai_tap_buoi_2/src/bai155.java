import java.util.Scanner;

public class bai155 {
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
    public static int Timmax(float a[],int n){
        float max = a[0];
        int k=0;
        for(int i=1;i<n;i++ ){
            //System.out.print(a[i]+" ");
            if(a[i]>max){
                max = a[i];
                k = i;
            }
        }
       // System.out.println();
        return k;
    }
    public static float sothucxaxnhat(float a[],int n,float x){
        float b[] = new float[n];
        int j =0;
        for (int i = 0;i<n;i++){
            b[j]= Math.abs((a[i]-x));
            j++;
        }
        return a[Timmax(b,n)];
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        System.out.println("So thuc xa x nhát : "+ sothucxaxnhat(a,n,10));
        //lietkecacsoam(a,n);
        // output(a,n);
    }
}
