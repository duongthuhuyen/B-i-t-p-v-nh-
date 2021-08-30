import java.util.Scanner;

public class bai124 {
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
    public static void kiemtra(int a[],int n){
        int k =-1;
        for(int i =0;i<n;i++){
            if(a[i]%2 ==0&& a[i]<2004){
                k =1;
                break;
            }
        }
        if(k ==1){
            System.out.println("có");
        }else{
            System.out.println("Không");
        }
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        int a[]=new int[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        kiemtra(a,n);
    }
}
