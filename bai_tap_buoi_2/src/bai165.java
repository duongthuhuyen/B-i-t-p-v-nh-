import java.util.Scanner;

public class bai165 {
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

    public static boolean check(int a){
        int b = 0;
        while(a>0){
            b = a%10;
            a = a/10;
        }
        if(b%2 == 1){
            return true;
        }
        return false;
    }
    public static int timso(int a[],int n){
        for(int i = 0;i<n ;i++){
            if(check(a[i])){
                return a[i];
            }
        }
        return 0;
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
        System.out.println("Số có chữ số đầu tiên là số lẻ đầu tiên trong dãy : "+timso(a,n));
    }
}
