package baitapvenhaoop_buoi1.bai6;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HangThucPham {
    private int maHang;
    private String tenHang;
    private double donGia;
    private Date NSX;
    private Date HSD;

    public HangThucPham() {
    }

    public HangThucPham(int maHang, String tenHang, double donGia, Date NSX, Date HSD) {
        //SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy")
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.NSX = NSX;
        this.HSD = HSD;
    }

    public HangThucPham(int maHang) {
        this.maHang = maHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNSX() {
        return NSX;
    }

    public void setNSX(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        this.NSX = calendar.getTime();
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,day);
        this.HSD = calendar.getTime();
    }

    @Override
    public String toString() {
        // định dạng tiền việt
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String dg = numberFormat.format(this.donGia);
        // định dạng ngày
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
        String nsx = simpleDateFormat.format(this.NSX);
        String hsd = simpleDateFormat.format(this.HSD);
        return "HangThucPham{" +
                "maHang=" + maHang +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + dg +
                ", NSX=" + nsx+
                ", HSD=" +hsd  +
                '}';
    }
    public boolean checkTenHang(boolean t){
        if(this.tenHang ==""|| this.tenHang.isEmpty()){
            //t =  true ;
            System.out.println("Ten hang khong duoc de chong");
        }else{
            t = false;
        }
        return t;
    }

    public boolean checkNgay(boolean t){
        if(this.NSX.compareTo(this.HSD)<0){
            t = false;
        }else {
            System.out.println("Ngày sản xuất phải trước hạn sử dụng");
        }
    return t;
    }
    public void checkHSD(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(date);
        if(this.HSD.compareTo(date)<0){
            System.out.println("Hom nay ngay "+st+" het han su dung");
        }else{
            System.out.println("Hom nay ngay "+st+" chua het HSD");
        }
    }
}
