import java.util.Scanner;

public class bai166 {
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
        if( a == 1){return true;}
       for(int i =1;i<= a/2;i++){
           if(Math.pow(2,i) == a){
               return true;
           }
       }
       return false;
    }
    public static int timso(int a[],int n){
        for(int i = 0;i<n ;i++){
            if(a[i]!= 1&& check(a[i])){
                return a[i];
            }else if(a[i] == 1){
                return 1;
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
        System.out.println("Số có dạng 2^k đầu tiên trong dãy là  : "+timso(a,n));
    }
}
