package baitapkethua.bai2;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class SachThamKhao extends Book{
    private double thue;

    public SachThamKhao(String id, Date ngayNhap, double donGia, int soLuong, String NXB, double thue) {
        super(id, ngayNhap, donGia, soLuong, NXB);
        this.thue = thue;
    }

    public SachThamKhao(double thue) {
        this.thue = thue;
    }

    public SachThamKhao() {
        super();
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào thuế: ");
        this.thue = sc.nextDouble();
        sc.nextLine();
    }
    public void output(){
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String t = numberFormat.format(this.thue);
        System.out.println("Sách tham khảo: ");
       // System.out.printf("%-");
        super.output();
        System.out.printf("%-20s\n",t);
    }
    public double thanhTien(){
        return this.getSoLuong()*this.getDonGia()+this.getThue();
    }

}
