package baitapkethua.bai8;

import java.time.LocalDate;

public class HangDienMay extends HangHoa{
    private int tgBaoHanh;
    private double congSuat;
    private LocalDate ngayNhapKho;
    private String nhaSX;
    //private final double vat = 0.1;

    public HangDienMay(String maHang, String tenHang, int SLton, double donGia, int tgBaoHanh, double congSuat) {
        super(maHang, tenHang, SLton, donGia);
        this.tgBaoHanh = tgBaoHanh;
        this.congSuat = congSuat;
        //super.getVat() = 0.1;
    }

    public HangDienMay(String maHang, String tenHang, int SLton, double donGia, int tgBaoHanh, double congSuat, LocalDate ngayNhapKho, String nhaSX) {
        super(maHang, tenHang, SLton, donGia);
        this.tgBaoHanh = tgBaoHanh;
        this.congSuat = congSuat;
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSX = nhaSX;
        //super.getVat() = 0.1;
    }

    public int getTgBaoHanh() {
        return tgBaoHanh;
    }

    public void setTgBaoHanh(int tgBaoHanh) {
        this.tgBaoHanh = tgBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public LocalDate getNgayNhapKho() {

        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    @Override
    public void setVat(double vat) {
        vat = 0.1;
        super.setVat(vat);
    }

    public boolean checktgBH(boolean t){
        if(this.tgBaoHanh<0){
            System.out.println("Thoi han bao hanh can nhap vao so thang khong am");
            t = false;
        }
        return t;
    }

    public boolean checkCongSuat(boolean t){
        if(this.congSuat<= 0){
            System.out.println("Cong suat phai duong");
            t = false;
        }
        return t;
    }

}
