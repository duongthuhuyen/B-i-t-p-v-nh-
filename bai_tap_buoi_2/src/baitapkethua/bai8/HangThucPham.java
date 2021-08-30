package baitapkethua.bai8;

import java.time.LocalDate;

public class HangThucPham extends HangHoa{
    private LocalDate NSX;
    private LocalDate NHH;
    private String nhaSX;
    //private final double vat = 0.05;
    public HangThucPham(String maHang, String tenHang, int SLton, double donGia, LocalDate NSX, LocalDate NHH, String nhaSX) {
        super(maHang, tenHang, SLton, donGia);
        this.NSX = NSX;
        this.NHH = NHH;
        this.nhaSX = nhaSX;
       // super.getVat() = 0.05;
    }

    @Override
    public void setVat(double vat) {
        vat = 0.05;
        super.setVat(vat);
        //vat
    }

    public LocalDate getNSX() {
        return NSX;
    }

    public void setNSX(LocalDate NSX) {
        this.NSX = NSX;
    }

    public LocalDate getNHH() {
        return NHH;
    }

    public void setNHH(LocalDate NHH) {
        this.NHH = NHH;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }
    public boolean checkNgay(boolean t){
        if(this.NHH.isBefore(this.NSX)){
            System.out.println("Ngay het han phai sau ngay san xuat");
            t = false;
        }
        return t;
    }
    public void checkHSD(){
        LocalDate day = LocalDate.now();
        if(this.NHH.isBefore(day)){
            System.out.println("Het han su dung");
        }else{
            System.out.println("Chua het han");
        }
    }

}
