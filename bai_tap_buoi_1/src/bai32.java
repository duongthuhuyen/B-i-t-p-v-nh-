import java.util.Scanner;

class bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = 2;
        for (int i =1;i<=n;i++){
            s = Math.sqrt(s);
        }
        System.out.print(s);
    }
}
