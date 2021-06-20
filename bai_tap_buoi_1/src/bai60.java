import java.util.Scanner;

public class bai60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = x%10;
        int kt =0;
        while(x>0){
            int a = x%10;
            if(a>=k){
                System.out.print("Không phải là số có các chữ số tăng dần từ trái xang phải");
                kt++;
                return;

            }
            k = a;
            x /=10;
           // k++;
        }
        if(kt ==0){
            System.out.print("Là số có các chữ số tăng dần từ trái xang phải");
        }
    }
}
