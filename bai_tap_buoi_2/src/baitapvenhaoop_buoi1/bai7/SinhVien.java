package baitapvenhaoop_buoi1.bai7;

import java.text.DecimalFormat;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private int SDT;
    public boolean checkSDT(boolean t){
        int dem = 0;
        int s = this.SDT;
        while(s>0){
            dem += 1;
            s/= 10;
        }
        if(dem != 7){
            System.out.println("SDT chi duoc co 7 chu so");
        }else{
            t = false;
        }
        return  t;
    }

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, String diaChi, int SDT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###-####");
        String sdt = decimalFormat.format(this.SDT);
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", SDT=" + sdt +
                '}';
    }
    public void hienThiTT() {
        DecimalFormat decimalFormat = new DecimalFormat("###-####");
        String sdt = decimalFormat.format(this.SDT);
        System.out.printf("%-5d %-20s %-15s %-20s \n", maSV, hoTen, diaChi, sdt);
    }
}
