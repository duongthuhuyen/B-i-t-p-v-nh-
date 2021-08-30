package baitapkethua.bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{
    public GiaoDichVang(String id, Date ngayGD, double donGia, int soLuong) {
        super(id, ngayGD, donGia, soLuong);
    }
    private String loaiVang;

    public GiaoDichVang(String id, Date ngayGD, double donGia, int soLuong, String loaiVang) {
        super(id, ngayGD, donGia, soLuong);
        this.loaiVang = loaiVang;
    }

    public GiaoDichVang() {
        super();
    }

    public String getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(String loaiVang) {
        this.loaiVang = loaiVang;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào loại vàng :");
        this.loaiVang = sc.nextLine();
    }
    public void output(){
        System.out.println("Vàng:");
        super.output();
        System.out.printf("%-20s\n",this.loaiVang);
    }

}

