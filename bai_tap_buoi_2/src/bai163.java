import java.util.Scanner;

public class bai163 {
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
    public static boolean checksochinhphuong(int a){
        //int s = 0;
        int b = (int) Math.sqrt((float) a);
        if(b*b == a){
            return true;
        }
        return false;
    }
    public static int Timsochinhphuongdautientrongmang (int a[],int n){

        for(int i = 0;i<n;i++){
            if(checksochinhphuong(a[i])){
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
        System.out.println("Số chính phương đầu tiên trong mảng: "+Timsochinhphuongdautientrongmang(a,n));
    }
}
