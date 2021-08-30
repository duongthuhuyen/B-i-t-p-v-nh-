import java.util.Scanner;

public class bai139 {
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
    public static boolean checksohoanthien(int a){
        int s = 0;
        for(int i = 1;i<=Math.sqrt(a);i++){
            if(a%i ==0){
                s+=(i+(a/i));
            }
        }
        if(s-a == a){
            return true;
        }
        return false;
    }
    public static int Timvitrisohoanhaocuoicung (int a[],int n){

        for(int i = n-1;i>=0;i--){
            if(checksohoanthien(a[i])){
                // max = a[i];
                return i;

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
        System.out.println("vị trí Số chẵn đầu tiên trong mảng : "+Timvitrisohoanhaocuoicung(a,n));
    }
}
