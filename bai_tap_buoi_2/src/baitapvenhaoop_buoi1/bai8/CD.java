package baitapvenhaoop_buoi1.bai8;

import java.text.NumberFormat;
import java.util.Locale;

public class CD {
    private int maCD;
    private String tenCD;
    private String casy;
    private int soLuong;
    private double gia;

    public CD() {
    }

    public CD(int maCD, String tenCD, String casy, int soLuong, double gia) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.casy = casy;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCasy() {
        return casy;
    }

    public void setCasy(String casy) {
        this.casy = casy;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tenCD='" + tenCD + '\'' +
                ", casy='" + casy + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }
    public boolean checkSL(boolean t){
        if(this.soLuong<0){
            System.out.println("SL phải lớn hơn 0 ");

        }else{
            t = false;
        }
        return t;
    }
    public boolean checkGia(boolean t){
        if(this.gia<0){
            //t = false;
            System.out.println("Đơn giá phải lớn hơn 0");
        }else{
            t = false;
        }
        return t;
    }
    public void hienthiCD(){
        //Locale locale = new Locale("vi","VN");
        //NumberFormat numberFormat =NumberFormat.getCurrencyInstance();
        //String g= numberFormat.format(locale);
        System.out.printf("%-10d %-20s %-20s %-10d %-20.1f \n",maCD,tenCD,casy,soLuong,gia);
    }
}
