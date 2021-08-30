import java.util.Scanner;

public class bai171 {
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

    public static int UCLN(int a,int b){
        if(a == 0){return b;}
        if(b == 0){return a;}
        while (a!= b){
            if(a>b){
                a= a-b;
            }
            if(b>a){
                b= b-a;
            }
        }
        return a;

    }
    public static int Timucln(int a[],int n){
        int ucln = UCLN(a[0],a[1]);
        for(int i = 2;i<n;i++){
            ucln = UCLN(ucln,a[i]);
        }
        return ucln;
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
        System.out.println("UCLN cua day  : "+Timucln(a,n));
    }
}
