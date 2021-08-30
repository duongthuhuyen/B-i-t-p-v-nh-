import java.util.Scanner;

public class bai174 {
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
    public static void list(int a[],int n){
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(a[j]>a[i]){
                    System.out.println(a[i]+" "+a[j]);
                }else if(a[j]<a[i]){
                    System.out.println(a[j]+" "+a[i]);
                }
            }
        }
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
       // System.out.println("Chữ số xuất hiện ít nhất trong dãy   : "+chusoxuathienitnhat(a,n));
        list(a,n);
    }

}
