package baitapkethua.bai3;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{

    public GiaoDichTienTe(String id, Date ngayGD, double donGia, int soLuong) {
        super(id, ngayGD, donGia, soLuong);
    }
    private double tyGia;
    private int loaiTienTe;

    public GiaoDichTienTe(String id, Date ngayGD, double donGia, int soLuong, double tyGia, int loaiTienTe) {
        super(id, ngayGD, donGia, soLuong);
        this.tyGia = tyGia;
        this.loaiTienTe = loaiTienTe;
    }

    public GiaoDichTienTe() {

    }

    public double getTyGia() {
        return tyGia;
    }

    public void setTyGia(double tyGia) {
        this.tyGia = tyGia;
    }

    public String getLoaiTienTe() {
        //return loaiTienTe;
        if (this.loaiTienTe == 1){
            return "Viet Nam";
        }else if(this.loaiTienTe == 2){
            return "USD";
        }else if (this.loaiTienTe == 3){
            return "Euro";
        }
        return "No identify";
    }

    public void setLoaiTienTe(int loaiTienTe) {
        this.loaiTienTe = loaiTienTe;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tiền tệ: ");
        super.input();
        System.out.println("Nhập vào tỷ giá: ");
        this.tyGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào loại tiền tệ (1-Việt Nam, 2-USD,3-Ero):");
        sc.nextInt();
        sc.nextLine();
    }
    public void output(){
        System.out.println("Tiền tệ :");
        super.output();
        System.out.printf("%-20.2f %-20s",this.tyGia,this.getLoaiTienTe());
    }
    public double ThanhTien(){
        //return this.getDonGia()*this.getDonGia();
        if(this.loaiTienTe == 2 || this.loaiTienTe == 3){
            return this.getSoLuong()*this.tyGia*this.getDonGia();
        }
        return this.getDonGia()*this.getSoLuong();
    }
}
