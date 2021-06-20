import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        int k = 0;
        while(x>0){
            int a = x%10;
            list.add(a);
            k++;
            x /=10;

        }
        int a =0;
        for(Integer l:list){
            a+=l*Math.pow(10,(double) (k-1));
            k--;
        }

        System.out.print(a);
    }
}
