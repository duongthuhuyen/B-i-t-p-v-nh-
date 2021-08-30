package bai_test_1;

import java.util.Scanner;

public class CoHuu extends GiangVien{

    private int soGioNCKH;
    private double luongCoBan;
    @Override
    public int getSoGioDay(GiangVien giangVien) {
        if(giangVien.getHocVi()=="Cử nhân"|| giangVien.getHocVi()=="Thạc sĩ"){
            return 460;
        }
        return 560;
    }

    public int getSoGioNCKH() {
        return soGioNCKH;
    }

    public void setSoGioNCKH(int soGioNCKH) {
        this.soGioNCKH = soGioNCKH;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Số giờ NCKH: ");
        this.setSoGioNCKH(sc.nextInt());
        System.out.println("Lương cơ bản: ");
        this.setLuongCoBan(sc.nextDouble());
    }

    @Override
    public double getLuong() {
        if(super.getHocVi()=="Cử nhân"){
            return this.luongCoBan+this.luongCoBan*0.15;
        }else if(super.getHocVi() == "Thạc sĩ"){
            return this.luongCoBan+this.luongCoBan*0.3;
        }else if(super.getHocVi()=="Tiến sĩ"){
            return this.luongCoBan+this.luongCoBan*0.5;
        }
        return this.luongCoBan+this.luongCoBan*0.7;
    }

    public double tienThuLao(int gioThucTe){
        if(gioThucTe<=this.getSoGioDay(this)||gioThucTe<this.soGioNCKH){
            return 0;
        }else if(gioThucTe>this.getSoGioDay(this)){
            return (gioThucTe-this.soGioNCKH)*80000-0.1*this.getLuong();
        }
        return -1;
    }



}
