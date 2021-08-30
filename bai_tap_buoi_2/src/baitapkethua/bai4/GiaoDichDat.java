package baitapkethua.bai4;

import java.util.Date;
import java.util.Scanner;

public class GiaoDichDat extends GiaoDichND{
    private int loaiDat;

    public GiaoDichDat(String id, Date dayOfGD, Double donGia, double square, int loaiDat) {
        super(id, dayOfGD, donGia, square);
        this.loaiDat = loaiDat;
    }

    public GiaoDichDat(String id, Date dayOfGD, Double donGia, double square) {
        super(id, dayOfGD, donGia, square);
    }

    public GiaoDichDat() {

    }

    public String getLoaiDat() {
        if(this.loaiDat == 1){
            return "Loại A";
        }else if (this.loaiDat == 2){
            return "Loại B";
        }else if(this.loaiDat == 3){
            return "Loại C";
        }
        return "Không xác định";
    }

    public void setLoaiDat(int loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-20s\n",this.getLoaiDat());
    }

    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào loại đất" +
                "(1-loại A,2-loại B,3-loại C):");
        this.loaiDat = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public double thanhTien() {
        if(this.loaiDat == 2|| this.loaiDat == 3){
            return this.getDonGia()*this.getSquare();
        }else if(this.loaiDat == 1){
            return this.getDonGia()*this.getSquare()*1.5;
        }return -1;
}
}