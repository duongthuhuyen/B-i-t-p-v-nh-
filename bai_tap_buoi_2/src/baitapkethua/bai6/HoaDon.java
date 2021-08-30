package baitapkethua.bai6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class HoaDon {
    private String idHD;
    private Date dayOfThue;
    private String nameOfKH;
    private String idP;
    private double donGia;

    public HoaDon(String idHD, Date dayOfThue, String nameOfKH, String idP, double donGia) {
        this.idHD = idHD;
        this.dayOfThue = dayOfThue;
        this.nameOfKH = nameOfKH;
        this.idP = idP;
        this.donGia = donGia;
    }

    public HoaDon() {

    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public Date getDayOfThue() {
        return dayOfThue;
    }

    public void setDayOfThue(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        this.dayOfThue = calendar.getTime();
    }

    public String getNameOfKH() {
        return nameOfKH;
    }

    public void setNameOfKH(String nameOfKH) {
        this.nameOfKH = nameOfKH;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã hóa đơn: ");
        this.idHD = sc.nextLine();
        System.out.println("Nhập vào ngày xuất hóa đơn:");
        this.setDayOfThue(sc.nextInt(),sc.nextInt(),sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào tên khách hàng: ");
        this.nameOfKH = sc.nextLine();
        System.out.println("Nhập vào mã phòng: ");
        this.idP = sc.nextLine();
        System.out.println("Nhập vào đơn giá: ");
        this.donGia = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
        String dg = numberFormat.format(this.donGia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String d = simpleDateFormat.format(this.dayOfThue);
        System.out.printf("%-20s %-20s %-20s %-20s %-20s",this.idHD,d,this.nameOfKH,this.idP,dg);
    }
    public double thanhTien(){
        return -1;
    }
}
