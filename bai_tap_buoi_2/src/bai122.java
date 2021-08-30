import java.util.Scanner;
public class bai122 {
    public static int ss(int a[],int n){
        int max = a[0];
        for(int i = 1;i<n;i++){
           if(a[i]>max){
               max = a[i];
           }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Số lớn nhất của mảng là : "+ss(a,n));
    }
}
