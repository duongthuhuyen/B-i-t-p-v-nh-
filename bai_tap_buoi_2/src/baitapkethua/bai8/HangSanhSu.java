package baitapkethua.bai8;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa{
    private LocalDate ngayNhapKho;
    private String nhaSX;
    //private final double vat = 0.1;
    public HangSanhSu(String maHang, String tenHang, int SLton, double donGia, LocalDate ngayNhapKho, String nhaSX) {
        super(maHang, tenHang, SLton, donGia);
        this.ngayNhapKho = ngayNhapKho;
        this.nhaSX = nhaSX;
    }

    public LocalDate getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(LocalDate ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public void setVat(double vat) {
        vat = 0.1;
        super.setVat(vat);
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }


}
