import java.util.Scanner;

public class bai170 {
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

    public static boolean KTsnt(int a){
        if(a== 2){return  true;}
        if(a == 1){return false;}
        for(int i = 2;i<= Math.sqrt(a);i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean kt(int a[],int n,int j){
        for(int i = 0;i<n;i++){
            if(i != j){
                if(a[i]>a[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int timmin(int a[],int n){
        int min = a[0];
        for(int i = 1;i<n;i++){
            if(a[i]<min){
                min= a[i];
            }
        }
        return min;
    }
    public static int timsochanlonnhatnhohonmoisole(int a[],int n){
        int b[] = new int[n];
        int j = 0;
        for(int i = 0;i<n;i++){
            if(KTsnt(a[i])){
                if(kt(a,n,i)){
                    //return false;
                    b[j]= a[i];
                    j++;
                }
            }
        }
        return timmin(b,j);
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
        System.out.println("Số chan lon nhat nho hon moi so le trong day  : "+timsochanlonnhatnhohonmoisole(a,n));
    }
}
