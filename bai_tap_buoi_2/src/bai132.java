import java.util.Scanner;

public class bai132 {
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
    public static void lietkecacsochan(int a[],int n){
        for(int i = 0;i<n;i++){
            if(a[i]%2 ==0){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        int a[]=new int[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+vitrimincuamang(a,n));
        lietkecacsochan(a,n);
    }
}
