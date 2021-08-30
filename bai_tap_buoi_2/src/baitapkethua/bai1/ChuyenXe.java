package baitapkethua.bai1;

import java.sql.SQLOutput;
import java.util.Scanner;

public abstract class ChuyenXe {
    private int id;
    private String nameOfDriver;
    private String numberDrive;
    private double sales;

    public ChuyenXe(int id, String nameOfDriver, String numberDrive, double sales) {
        this.id = id;
        this.nameOfDriver = nameOfDriver;
        this.numberDrive = numberDrive;
        this.sales = sales;
    }

    public ChuyenXe() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public String getNumberDrive() {
        return numberDrive;
    }

    public void setNumberDrive(String numberDrive) {
        this.numberDrive = numberDrive;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "ChuyenXe{" +
                "id=" + id +
                ", nameOfDriver='" + nameOfDriver + '\'' +
                ", numberDrive='" + numberDrive + '\'' +
                ", sales=" + sales +
                '}';
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vào Mã số chuyến xe: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào Họ tên tài xế: ");
        this.nameOfDriver= sc.nextLine();
        System.out.println("Nhập vào số xe: ");
        this.numberDrive = sc.nextLine();
        System.out.println("Nhập vào doanh thu: ");
        this.sales = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        System.out.printf("%-10d %-20s %-20s %-10.2f",this.id,this.nameOfDriver,this.numberDrive,this.sales);
    }
}
