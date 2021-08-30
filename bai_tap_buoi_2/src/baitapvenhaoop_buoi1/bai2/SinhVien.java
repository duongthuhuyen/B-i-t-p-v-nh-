package baitapvenhaoop_buoi1.bai2;

public class SinhVien {
    private int maSV;
    private String Hovaten;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hovaten, float diemLT, float diemTH) {
        this.maSV = maSV;
        Hovaten = hovaten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }
    public float tinhDiemTrungBinh(){
        return (this.diemLT+this.diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", Hovaten='" + Hovaten + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
}
