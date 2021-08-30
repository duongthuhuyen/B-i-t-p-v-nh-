import java.util.Scanner;

public class bai161 {
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
    public static float timso(float a[],int n,float x,float y){
        for(int i = 0;i<n;i++){
            if(a[i]>x && a[i]<y){
                return a[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        float a[]=new float[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        System.out.println("So thuc đầu tiên thuọc khoảng (x,y)  : "+ timso(a,n,1,10));
        //lietkecacsoam(a,n);
        // output(a,n);
    }
}
