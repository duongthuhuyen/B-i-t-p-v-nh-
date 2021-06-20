import java.util.Scanner;

public class bai42 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, s =1 ;
        while(s < n){
            int m = 0;
            for(int j = 1;j<= i;j++){
                m+=j;
            }
            //System.out.print(m+" ");
            s = m;
            i++;
        }
        System.out.println(i-2);

    }
}
