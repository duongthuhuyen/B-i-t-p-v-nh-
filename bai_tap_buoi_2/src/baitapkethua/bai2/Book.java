package baitapkethua.bai2;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Book {
    private String id;
    private Date ngayNhap;
    private double donGia;
    private int soLuong;
    private String NXB;

    public Book(String id, Date ngayNhap, double donGia, int soLuong, String NXB) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.NXB = NXB;
    }

    public Book() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        this.ngayNhap = calendar.getTime();
        //this.ngayNhap = ngayNhap;
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

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
        this.id = sc.nextLine();
       // sc.nextLine();
        System.out.println("Nhập vào năm , tháng ,ngày nhập sách");
        this.setNgayNhap(sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào Đơn giá : ");
        this.donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào Số lượng sách: ");
        this.soLuong = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào nhà xuất bản sách: ");
        this.NXB = sc.nextLine();
        //sc.nextLine();
    }
    public void output(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String dg = numberFormat.format(this.donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String s = simpleDateFormat.format(this.ngayNhap);
        System.out.printf("%-20s %-20s %-20s %-20d %-20s ",this.id,s,dg,this.soLuong,this.NXB);
    }
    public double thanhTien(){
        return -1;
    }
}
