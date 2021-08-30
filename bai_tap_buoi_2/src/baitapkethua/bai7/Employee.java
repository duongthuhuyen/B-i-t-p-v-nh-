package baitapkethua.bai7;

import java.util.Scanner;

public class Employee extends Person{
    private double heSoLuong;
    private String danhGia;

    public Employee(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public Employee(double heSoLuong, String danhGia) {
        this.heSoLuong = heSoLuong;
        this.danhGia = danhGia;
    }

    public Employee(String name, String addres, double heSoLuong) {
        super(name, addres);
        this.heSoLuong = heSoLuong;
    }

    public Employee() {

    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public double tinhLuong(){
        return this.heSoLuong*2000000;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }

    @Override
    public String toString() {
        return "Employee : "+super.toString()+"" +
                ",lương: "+this.tinhLuong()+"" +
                "Đánh giá: "+this.danhGia;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào hệ số lương :");
        this.heSoLuong = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào đánh giá: ");
        this.danhGia = sc.nextLine();
    }
}
