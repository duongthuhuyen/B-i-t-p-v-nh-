package baitapkethua.bai7;

import java.util.Scanner;

public class Customer extends  Person{
    private String nameOfCompany;
    private Double priceOfCrecit;
    private String comment;

    public Customer(String nameOfCompany, Double priceOfCrecit, String comment) {
        this.nameOfCompany = nameOfCompany;
        this.priceOfCrecit = priceOfCrecit;
        this.comment = comment;
    }

    public Customer(String name, String addres, String nameOfCompany, Double priceOfCrecit, String comment) {
        super(name, addres);
        this.nameOfCompany = nameOfCompany;
        this.priceOfCrecit = priceOfCrecit;
        this.comment = comment;
    }

    public Customer() {

    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public Double getPriceOfCrecit() {
        return priceOfCrecit;
    }

    public void setPriceOfCrecit(Double priceOfCrecit) {
        this.priceOfCrecit = priceOfCrecit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                ",nameOfCompany='" + nameOfCompany + '\'' +
                ", priceOfCrecit=" + priceOfCrecit +
                ", comment='" + comment + '\'' +
                '}';
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào tên công ty: ");
        this.nameOfCompany = sc.nextLine();
        System.out.println("Nhập vào trị giá hóa đơn: ");
        this.priceOfCrecit = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào đánh giá: ");
        this.comment = sc.nextLine();
    }
}
