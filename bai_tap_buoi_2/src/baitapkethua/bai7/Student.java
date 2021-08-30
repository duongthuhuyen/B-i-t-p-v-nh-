package baitapkethua.bai7;

import java.util.Scanner;

public class Student extends Person{
    private double score1;
    private double score2;
    private double score3;

    public Student(double score1, double score2, double score3) {
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public Student(String name, String addres, double score1, double score2, double score3) {
        super(name, addres);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public Student(){

    }

    public double getScore1() {
        return score1;
    }

    public void setScore1(double score1) {
        this.score1 = score1;
    }

    public double getScore2() {
        return score2;
    }

    public void setScore2(double score2) {
        this.score2 = score2;
    }

    public double getScore3() {
        return score3;
    }

    public void setScore3(double score3) {
        this.score3 = score3;
    }
    public double scoreOfAverage(){
        return (score1+score2+score3)/3;
    }
    public void danhGia(){
        if(this.scoreOfAverage()<5){
            System.out.println("Học lực kém , cần chú ý hơn");

        }else if(this.scoreOfAverage()<8){
            System.out.println("Học lực trung bình, cố gắng hơn nữa nhé ");
        }else if(this.scoreOfAverage()<9){
            System.out.println("Học lực giỏi , thêm chút nữa lên xuất xắc nào");
        }else{
            System.out.println("Học lực xuất xắc, chúc mừng bạn");
        }
    }

    @Override
    public String toString() {
        return "Student : "+ super.toString()+ "Điểm môn 1: "+this.score1+
                ",Điểm môn 2: "+this.score2+
                ",Điểm môn 3: "+this.score3+
                ",Điểm trung bình 3 môn: "+this.scoreOfAverage();

    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào điểm môn1 :");
        this.score1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào điểm môn2: ");
        this.score2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào điểm môn3: ");
        this.score3 = sc.nextDouble();
        sc.nextLine();
    }
}
