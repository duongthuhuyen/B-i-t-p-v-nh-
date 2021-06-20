import java.util.*;
import java.util.List;
//import java.util.Collection;
public class bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        //int s =1 ;
        for (int i = 1; i <= (int) Math.sqrt((double) n); i++) {
            if (n % i == 0) {
                if (i % 2 == 1) {
                    //System.out.print(i+" ");
                    list.add(i);
                }
                if (i * i != n) {
                    if ((n / i) % 2 == 1) {
                        //System.out.print(n/i+" ");
                        list.add(n/i);
                    }
                }
                // System.out.print(i+" ");
            }
        }
        System.out.print( Collections.max(list));
    }
}
