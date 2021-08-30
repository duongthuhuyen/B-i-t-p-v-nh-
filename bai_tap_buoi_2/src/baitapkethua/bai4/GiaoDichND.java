package baitapkethua.bai4;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class GiaoDichND {
    private String id;
    private Date dayOfGD;
    private double donGia;
    private double square;

    public GiaoDichND(String id, Date dayOfGD, double donGia, double square) {
        this.id = id;
        this.dayOfGD = dayOfGD;
        this.donGia = donGia;
        this.square = square;
    }

    public GiaoDichND() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDayOfGD() {
        return dayOfGD;
    }

    public void setDayOfGD(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);

        this.dayOfGD = calendar.getTime();
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã giao dịch: ");
        this.id = sc.nextLine();
        System.out.println("Nhập vào năm, tháng, ngày giao dịch :");
        this.setDayOfGD(sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào Đơn giá:");
        this.donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào diện tích:");
        this.square = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String d = numberFormat.format(this.donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String da = simpleDateFormat.format(this.getDayOfGD());
        System.out.printf("%-20s %-20s %-20s %-20.2f",this.id,da,d,this.square);
    }
    public double thanhTien(){
        return this.donGia*this.square;
    }
}
