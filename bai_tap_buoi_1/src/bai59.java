import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int x = sc.nextInt();
        //int s =x;
        int k = 0;
        while(x>0){
            int a = x%10;
            list.add(a);
            x /=10;
            k++;
        }
        //System.out.print(k+" ");
        int kt =0;
        for(int i =1;i<=k/2;i++){
            if(list.get(i-1)!=list.get(k-i)){
                System.out.print("Khong phai là số đối xứng");
                kt++;
                return;
            }
        }
        if(kt ==0){
            System.out.print("Là số đối xứng");
        }

        //System.out.print(k);
    }
}
