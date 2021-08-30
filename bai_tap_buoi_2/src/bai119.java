import java.util.Scanner;

public class bai119 {
    public static boolean ktsnt(int x){
        boolean k = true;
        for (int i = 2;i<= Math.sqrt(x);i++){
            if(x%i==0){
                k = false;
                break;
            }
        }
        return k;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =2;i<=x;i++){
            if(ktsnt(i)==true){
                System.out.println(i);
            }
        }
    }

}
