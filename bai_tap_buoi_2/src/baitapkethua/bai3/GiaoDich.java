package baitapkethua.bai3;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public abstract class GiaoDich {
    private String id;
    private Date ngayGD;
    private double donGia;
    private int soLuong;

    public GiaoDich(String id, Date ngayGD, double donGia, int soLuong) {
        this.id = id;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public GiaoDich() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        this.ngayGD = calendar.getTime();
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("NHập vào mã giao dịch");
        this.id = sc.nextLine();
        System.out.println("NHập vào năm , tháng , ngày giao dịch ");
        this.setNgayGD(sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào Đơn giá: ");
        this.donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào số lượng ");
        this.soLuong = sc.nextInt();
        sc.nextLine();

    }
    public void output(){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
        String t = numberFormat.format(this.donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String d = simpleDateFormat.format(this.ngayGD);
        System.out.printf("%-20s %-20s %-20s %-20d",this.id,d,t,this.soLuong);
    }
    public double ThanhTien(){
        return this.soLuong*this.donGia;
    }

}
