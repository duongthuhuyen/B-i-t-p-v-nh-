package baitapvenhaoop_buoi1.bai1;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuDai*this.chieuRong;
    }
    public double tinhChuVi(){
        return (this.chieuRong+this.chieuDai)*2;
    }
    public String toString(){
        String s = "";
        s+= this.chieuDai+" "+this.chieuRong+" "+this.tinhChuVi()+" "+this.tinhDienTich();
        return s;
    }
}
