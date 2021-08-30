package baitapkethua.bai10;

import java.util.Scanner;

public class Student extends Person {
    private double score1;
    private double score2;

    public Student(double score1, double score2) {
        this.score1 = score1;
        this.score2 = score2;
    }

    public Student() {

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

    public void inputScore(){
        Scanner sc = new Scanner(System.in);
        this.score1 = sc.nextDouble();
        sc.nextLine();
        this.score2 = sc.nextDouble();
        sc.nextLine();
    }

    public double sumScore(){
        return this.score2+this.score1;
    }

    public void choseForChange(){
        System.out.println("0: Thay đổi điểm môn 1\n" +
                "1: Thay đổi điểm môn 2");
        System.out.println("Nhập vào lựa chọn :");
        super.choseForChange();




    }

    @Override
    public void change(Person person) {
        //super.change(person);
        person = new Student();
        //if(choseForChange() )
    }
}
