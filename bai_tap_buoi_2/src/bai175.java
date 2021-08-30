import java.util.Scanner;

public class bai175 {
    public static void input(double a[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextDouble();
        }
    }
 /*   public static void output(float a[],int n){
        for(int i=0;i<n;i++ ){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }*/
    public static int Timmax(double a[],int n){
        double max = a[0];
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
    public static void sothucxaxnhat(double a[],int n){
        double b[] = new double[n];
        int j =0;
        for (int i = 0;i<n-1;i++){
           b[j]= Math.abs(a[i+1]-a[i]);
           j++;
        }
        System.out.println(a[Timmax(b,j)]+" "+a[Timmax(b,j)+1]);
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        double a[]=new double[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
       // System.out.println("So thuc xa x nhát : "+ sothucxaxnhat(a,n,10));
        //sothucxaxnhat(a,n);
        //lietkecacsoam(a,n);
        // output(a,n);
    }
}
