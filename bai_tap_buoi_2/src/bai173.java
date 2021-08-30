import java.util.Scanner;

public class bai173 {
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

    public static int chusoxuathienitnhat(int a[],int n){
        int b[] = new int[10];
        for(int i= 0;i<n;i++ ){
            while(a[i]>0){
                b[a[i]%10]++;
                a[i]/=10;
            }
        }
        int k = 0;
        int min = 0;
        int j = 0;
        for(int i = 0;i<b.length;i++){
            if(b[i]>0){
                min = b[i];
                k = i;
                j = i+1;
                break;
            }
        }
        for(int i = j;i<b.length;i++){
            if(b[i]<min&& b[i]>0){
                min = b[i];
                 k = i;
                //j = i+1;
                //break;
            }
        }

         return k;
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
        System.out.println("Chữ số xuất hiện ít nhất trong dãy   : "+chusoxuathienitnhat(a,n));
    }
    
}
