package baitapkethua.bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon{
    public HoaDonTheoGio(String idHD, Date dayOfThue, String nameOfKH, String idP, double donGia) {
        super(idHD, dayOfThue, nameOfKH, idP, donGia);
    }
    private double soGioThue;

    public HoaDonTheoGio(String idHD, Date dayOfThue, String nameOfKH, String idP, double donGia, double soGioThue) {

        super(idHD, dayOfThue, nameOfKH, idP, donGia);
        this.soGioThue = soGioThue;
    }

    public HoaDonTheoGio() {
        super();
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(double soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào số giờ thuê phòng: ");
        this.soGioThue = sc.nextDouble();
        //sc.nextLine();
    }
    public boolean kt(boolean t){
        if(this.soGioThue>= 30){
            System.out.println("Không thể sử dụng mục hóa đơn theo giờ ");
            t = false;
        }
        return t;
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20.2f\n",this.soGioThue);
    }

    @Override
    public double thanhTien() {
        if(this.soGioThue>24 && this.soGioThue<30){
            return 24*this.getDonGia();
        }
        return this.soGioThue*this.getDonGia();
    }
}
