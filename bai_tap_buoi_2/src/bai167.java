import java.util.Scanner;

public class bai167 {
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

    public static boolean check(int c){
        int b = 0;
        int a =c;
        while(a>0){
            b = a%10;
            a = a/10;
            if( b%2 == 0){
                return false;
            }

        }
        return true;
    }
    public static int timso(int a[],int n){
        int m = 0;
        int j = 0;
        for(int i = 0;i<n ;i++){
            if(check(a[i])){
                //return a[i];
                m = a[i];
                j = i;
                //System.out.println(m);
                break;
            }
        }
        for(int i = j+1;i<n ;i++){
            if(check(a[i]) ){
                if(a[i]>m) {
                    //return a[i];
                    m = a[i];
                    //break;
                    //j = i;
                }
            }
        }
        return m;
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
        //System.out.println(check(113));
        System.out.println("Số toàn chữ số lẻ lớn nhất trong dãy là  : "+timso(a,n));
        //timso(a,n);
    }
}
