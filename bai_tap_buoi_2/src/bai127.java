import java.util.Scanner;

public class bai127 {
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
    public static void sapxeptang(float a[],int n){
        for(int i =0;i<n-2;i++){
            for(int j =i+1;j<n;j++){
                if(a[j]<a[i]){
                    float b =a[j];
                    a[j]= a[i];
                    a[i]=b;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
       // System.out.println("Tổng các số thực trong mảng là : "+tong(a,n));
        sapxeptang(a,n);
        output(a,n);
    }
}
