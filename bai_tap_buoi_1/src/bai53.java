import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        int k = x%10;
        while(x>0){
            int a= x%10;
            list.add(a);
            if(k<a){
                k=a;
            }
            x /=10;

        }
        int dem =0;
        for(Integer j:list){
            if(k== j){
                dem++;
            }
        }
        System.out.print(dem);
    }
}
