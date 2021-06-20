import java.util.Scanner;

public class bai66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double denta = b*b-4*a*c;
        if(denta < 0){
            System.out.print("Phương trình vô nghiệm");
        }else if(denta ==0){
            double k= -b/(2*a);
            if(k==0){
                System.out.println("Phương trình có 1 nghiêm x = 0");
            }else if(k>0){
                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("x1 = "+Math.sqrt(k));
                System.out.println("x2 = "+(-1*Math.sqrt(k)));
            }else{
                System.out.println("Phương trình vô nghiệm");
            }
        }else{
            //System.out.println("Phương trình có 2 nghiệm phân biệt :");
            double x1 = (-b-Math.sqrt(denta))/(2*a);
            double x2 = (-b+Math.sqrt(denta))/(2*a);
            if(x1<0){
                if(x2<0){
                System.out.println("Phương trình vô nghiệm");}
                else if (x2 ==0){
                    System.out.println("Phương trình có nghiệm duy nhất x = 0");
                }else{
                    System.out.println("Phương trình có 2 nghiệm phân biệt ");
                    System.out.println("x1 = "+Math.sqrt(x2));
                    System.out.println("x2 = "+(-1*Math.sqrt(x2)));
                }
            }else if(x1==0){
                if(x2 ==0 || x2 <0){
                    System.out.println("Phương trình có nghiệm duy nhất x = 0");
                }else{
                    System.out.println("Phương trình có 3 nghiệm phân biệt");
                    System.out.println("x1 = 0");
                    System.out.println("x2 = "+Math.sqrt(x2));
                    System.out.println("x3 = "+(-1*Math.sqrt(x2)));
                }
            }else{
                if(x2<0){
                    System.out.println("Phương trình có 2 nghiêm phân biệt:");
                    System.out.println("x1 = "+Math.sqrt(x1));
                    System.out.println("x2 = "+(-1*Math.sqrt(x1)));
                }else if(x2 == 0){
                    System.out.println("Phương trình có 3 nghiệm phân biệt: ");
                    System.out.println("x1 = 0");
                    System.out.println("x2 = "+Math.sqrt(x1));
                    System.out.println("x3 = "+(-1*Math.sqrt(x1)));
                }else{
                    System.out.println("Phương trình có 4 nghiệm phân biệt");{
                        System.out.println("x1 = "+Math.sqrt(x1));
                        System.out.println("x2 = "+(-1*Math.sqrt(x1)));
                        System.out.println("x3 = "+Math.sqrt(x2));
                        System.out.println("x4 = "+(-1*Math.sqrt(x2)));
                    }
                }
            }
        }
    }
}
