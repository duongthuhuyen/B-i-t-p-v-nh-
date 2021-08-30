import java.util.Scanner;

public class bai115 {
    public static double diemtrungbinh(double toan,double van){
        return (toan+van)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten = sc.next();
        double toan = sc.nextDouble();
        double van = sc.nextDouble();
        System.out.println("Ten sv : "+ hoten);
        System.out.println("Diem trung bình 2 môn toán văn :"+diemtrungbinh(toan,van));
    }
}
