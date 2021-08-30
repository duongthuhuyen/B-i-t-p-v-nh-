import java.util.Scanner;

public class bai123 {
    public static void input(int a[],int n ){
        Scanner sc = new Scanner(System.in);
        //System.out.println("n = ");
        //n =sc.nextInt();
        for(int i=0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i]= sc.nextInt();
        }
    }
    public static void output(int a[],int n){
        for(int i=0;i<n;i++ ){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static int min(int a[],int n){
        int min = a[0];
        for(int i =1;i<n;i++){
            if(min>a[i]){
                min = a[i];
            }
        }
        return min;
    }
    public static int vitrimincuamang(int a[],int n){
        int b =0;
        for(int i = 0;i<n;i++){
            if(min(a,n)==a[i]){
                b = i;
                break;
            }
        }
        return b+1;
    }
    public static void main(String[] args) {
        int n =5;
       //int n
        int a[]=new int[n];
        input(a,n);
        System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+vitrimincuamang(a,n));
    }
}
