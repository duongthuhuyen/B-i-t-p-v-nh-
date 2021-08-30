package baitapvenhaoop_buoi1.bai4;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private long soTK;
    private String tenTK;
    private double tienTK;
    final double laiSuat = 0.035;
    public Account() {
    }

    public Account(long soTK, String tenTK, double tienTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTK = tienTK;
    }

    public long getSoTK() {
        return soTK;
    }

    public void setSoTK(long soTK) {
        this.soTK = soTK;
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public double getTienTK() {
        return tienTK;
    }

    public void setTienTK(double tienTK) {
        this.tienTK = tienTK;
    }

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi","VN");
        NumberFormat numberFormat  = NumberFormat.getNumberInstance(localeVN);
        String number = numberFormat.format(this.tienTK);

        return "Account{" +
                "soTK=" + soTK +
                ", tenTK='" + tenTK + '\'' +
                ", tienTK=" + number +
                '}';
    }

    public Account(long soTK, String tenTK) {
        this.soTK = soTK;
        this.tenTK = tenTK;
        this.tienTK = 50;
    }
    public void napTienTK(double x){
        if(x>0) {
            this.tienTK += x;
        }else{
            System.out.println("Khong hop le");
        }
    }
    public void rutTienTK(double soTienRutRa,double phiDichVu){
        double x = this.tienTK - (soTienRutRa+phiDichVu);
        if(x>50){
            this.tienTK = x;
        }else{
            System.out.println("Khong hop le");
        }
       // this.tienTK -= (soTienRutRa+phiDichVu);
    }
    public void daoHan(){
        this.tienTK+=(this.tienTK*laiSuat);
    }
    public void chuyenKhoan(Account a,int x,int phiDichVu){
        double k = this.tienTK -x-phiDichVu;
        if (k>50){
            a.tienTK += x;
            this.tienTK = k;
        }else{
            System.out.println("Khong hop le");
        }
    }
}
