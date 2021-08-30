import java.util.Scanner;

public class bai136 {
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
    public static int Timsoduongdautien(int a[],int n){

        for(int i = n-1;i>=0;i--){
            if(a[i]%2  ==0){
                // max = a[i];
                return a[i];

            }
        }
        return -1;
        //System.out.println();
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        int a[]=new int[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        //kiemtraSNTtrongmang(a,n);
        // System.out.println("Tổng các số thực trong mảng là : "+tong(a,n));
        // lietkecacsoam(a,n);
        // output(a,n);
        System.out.println("Số chẵn cuối cùng của mảng : "+Timsoduongdautien(a,n));
    }
}
