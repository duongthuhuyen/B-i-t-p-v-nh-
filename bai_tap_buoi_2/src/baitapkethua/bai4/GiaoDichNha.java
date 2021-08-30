package baitapkethua.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichNha extends GiaoDichND{
    private int loaiNha;
    private String diaChi;

    public GiaoDichNha(String id, Date dayOfGD, Double donGia, double square, int loaiNha) {
        super(id, dayOfGD, donGia, square);
        this.loaiNha = loaiNha;
    }

    public GiaoDichNha() {
        super();
    }

    public String getLoaiNha() {
        //return loaiNha;
        if(this.loaiNha == 1){
            return "Nhà cao cấp";

        }else if (this.loaiNha == 2){
            return "Nhà thường";
        }
        return "Không xác định";
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vaò loại nhà" +
                "(1-Nhà cao cấp, 2-Nhà thường ):");
        this.loaiNha = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào địa chỉ nhà: ");
        this.diaChi = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20s %-20s\n",this.getLoaiNha(),this.diaChi);
    }

    @Override
    public double thanhTien() {
        //return super.thanhTien();
        if(this.loaiNha == 1){
            return this.getDonGia()*this.getSquare();
        }else if (this.loaiNha == 2){
            return this.getDonGia()*this.getSquare()*0.9;
        }
        return -1;
    }
}
