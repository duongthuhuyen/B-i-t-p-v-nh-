import java.util.Scanner;

public class bai65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double denta = b*b-4*a*c;
        if(denta < 0){
            System.out.print("Phương trình vô nghiệm");
        }else if(denta ==0){
            System.out.print("Phương trình có nghiệm duy nhất  "+(-b/(2*a)));
        }else{
            System.out.println("Phương trình có 2 nghiệm phân biệt :");
            System.out.println("x1 = "+(-b-Math.sqrt(denta))/(2*a));
            System.out.println("x2 = "+(-b+Math.sqrt(denta))/(2*a));
        }
    }
}
