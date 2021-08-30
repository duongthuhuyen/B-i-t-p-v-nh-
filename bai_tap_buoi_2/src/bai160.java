import java.util.Scanner;

public class bai160 {
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
    public static float timso(float a[],int n){
        for(int i = n-1;i>= 0;i--){
            if(a[i]>-1 && a[i]<0){
                return a[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        System.out.println("So thuc cuối cùng lớn hơn -1  : "+ timso(a,n));
        //lietkecacsoam(a,n);
        // output(a,n);
    }
}
