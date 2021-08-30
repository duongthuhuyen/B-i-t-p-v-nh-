package baitapkethua.bai2;

import java.util.Date;
import java.util.Scanner;

public class SGK extends Book{
    private boolean tinhTrang;

    public SGK(String id, Date ngayNhap, double donGia, int soLuong, String NXB, boolean tinhTrang) {
        super(id, ngayNhap, donGia, soLuong, NXB);
        this.tinhTrang = tinhTrang;
    }

    public SGK(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SGK() {
        super();
    }


    public String getTinhTrang(){
        String s = "";
        if(this.tinhTrang == true){
            s+="Sách cũ";
        }else{
            s+= "Sách mới";
        }
        return s;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhap vao tinh trang cua sach:(1 la cu , 2 la moi");
        int k = sc.nextInt();
        if(k == 1){
            this.tinhTrang = true;
        }else if(k == 2){
            this.tinhTrang = false;
        }
        sc.nextLine();

    }
    public void output(){
        System.out.println("Sách Giáo khoa: ");
        super.output();
        System.out.printf("%-20s\n",this.getTinhTrang());
    }
    public double thanhTien(){
        double s = 0;
        if(this.tinhTrang == true){
            s = this.getSoLuong()*this.getDonGia()*0.5;
        }else{
            s = this.getSoLuong()*this.getDonGia();
        }
        return s;
    }

}
