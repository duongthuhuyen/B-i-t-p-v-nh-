package baitapkethua.bai6;

import java.util.Date;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon{
    public HoaDonTheoNgay(String idHD, Date dayOfThue, String nameOfKH, String idP, double donGia) {
        super(idHD, dayOfThue, nameOfKH, idP, donGia);
    }
    private int soNgayThue;

    public HoaDonTheoNgay(String idHD, Date dayOfThue, String nameOfKH, String idP, double donGia, int soNgayThue) {
        super(idHD, dayOfThue, nameOfKH, idP, donGia);
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay() {

    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào số ngày thuê: ");
        this.soNgayThue = sc.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20d\n",this.soNgayThue);
    }

    @Override
    public double thanhTien() {
        //return super.thanhTien();
        if(this.soNgayThue>7){
            return (double) this.soNgayThue*this.getDonGia()*0.8;
        }
        return (double) this.soNgayThue*this.getDonGia();
    }
}
