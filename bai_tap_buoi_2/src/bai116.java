import java.util.Scanner;

public class bai116 {
    public static int tong(int x){
        int s = 0;
        for(int i=1;i<=x;i++){
            s+=i;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Tổng là : "+ tong(x));
    }
}
