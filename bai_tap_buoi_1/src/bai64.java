import java.util.Scanner;

public class bai64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a==0){
            System.out.print("Phương trình vô nghiệm");
        }else{
            System.out.print("Phương trinh có 1 nghiệm duy nhất x = "+(-b/a));
        }
    }
}
