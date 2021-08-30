package baitapkethua.bai8;

import java.util.Scanner;

public abstract class HangHoa {
    private String maHang ;
    private String tenHang;
    private int SLton;
    private double donGia;
    private double vat ;

    public HangHoa(String maHang, String tenHang, int SLton, double donGia, double vat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.SLton = SLton;
        this.donGia = donGia;
        this.vat = vat;
    }

    public HangHoa(String maHang, String tenHang, int SLton, double donGia) {
        final String s = maHang;
        this.maHang = s;
        this.tenHang = tenHang;
        this.SLton = SLton;
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    // không sửa được thì không có hàm setMaHang

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSLton() {
        return SLton;
    }

    public void setSLton(int SLton) {
        this.SLton = SLton;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public boolean checkMH(boolean t){
        if(this.maHang.equals("")||this.maHang.isEmpty()){
            System.out.println("Ma hang khong duoc de trong, nhập lại");
            t = true;
        }else{
            t = false;
        }
        return t;
    }
    public boolean checkTenHang(boolean t){
        if (this.tenHang.equals("")||this.tenHang.isEmpty()){
            System.out.println("Ten hang khong duoc de trong, nhập lại");
            t = true;
        }else{
            t = false;
        }
        return t;
    }
    public boolean checkSLT(boolean t){
        if(this.SLton <0){
            System.out.println("So luong ton phai khong am,nhập lại");
            t = true;
        }else{
            t = false;
        }
        return t;
    }
    public boolean checkDonGia(boolean t){
        if(this.donGia<=0){
            System.out.println("Don gia phai duong,nhập lại");
            t = true;
        }else {
            t = false;
        }
        return t;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        boolean k = true;
        boolean h = true;
        boolean j = true;
        System.out.println("Nhập vào Mã hàng");
        do {
            this.maHang = sc.nextLine();
        }while (this.checkMH(t));
        System.out.println("Nhập vào tên hàng: ");
        do{
            this.tenHang = sc.nextLine();
        }while (checkTenHang(k));
        System.out.println("Nhập vào số lượng tồn kho: ");
        do{
            this.SLton= sc.nextInt();
            sc.nextLine();
        }while (checkSLT(h));
        System.out.println("Nhập vào đơn giá: ");
        do{
            this.donGia = sc.nextDouble();
            sc.nextLine();
        }while (checkDonGia(j));
    }
}
