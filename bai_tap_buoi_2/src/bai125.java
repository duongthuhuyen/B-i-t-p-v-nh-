import java.util.Scanner;

public class bai125 {
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
    public static boolean kiemtra(int a){
       boolean k = true;
       if(a == 1){k =false;}
       if(a >2){
       for(int i =2;i<=Math.sqrt(a);i++){
           if(a%i ==0){
               k =false;
               break;
           }
       }}
       return k;
    }
    public static void kiemtraSNTtrongmang(int a[],int n){
        int d = 0;
        for(int i =0;i<n;i++){
            if(kiemtra(a[i])==true){
                d = 1;
                break;
            }
        }
        if(d ==1){
            System.out.println("Trong mảng có số nguyên tố");
        }else{
            System.out.println("Trong mảng không có số nguyên tố");
        }
    }
    public static void main(String[] args) {
        int n =5;
        //int n
        int a[]=new int[n];
        input(a,n);
        //System.out.println("Vị trí của phần tử nhỏ nhất trong mảng là : "+);
        kiemtraSNTtrongmang(a,n);
    }
}
