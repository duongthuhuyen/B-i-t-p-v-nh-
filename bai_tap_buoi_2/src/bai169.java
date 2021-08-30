import java.util.Scanner;

public class bai169 {
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


    public static boolean kt(int a[],int n,int b){
        for(int i = 0;i<n;i++){
            if(a[i]%2== 1){
                if(b>a[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public static int timmax(int a[],int n){
        int max = a[0];
        for(int i = 1;i<n;i++){
            if(a[i]>max){
                max= a[i];
            }
        }
        return max;
    }
    public static int timsochanlonnhatnhohonmoisole(int a[],int n){
        int b[] = new int[n];
        int j = 0;
        for(int i = 0;i<n;i++){
            if(a[i]%2== 0){
                if(kt(a,n,a[i])){
                    //return false;
                    b[j]= a[i];
                    j++;
                }
            }
        }
        return timmax(b,j);
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
