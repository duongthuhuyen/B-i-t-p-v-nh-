package baitapkethua.bai1;

import java.util.Scanner;

public class NgoaiThanh extends ChuyenXe{
    public NgoaiThanh(int id, String nameOfDriver, String numberDrive, double sales) {
        super(id, nameOfDriver, numberDrive, sales);
    }
    private String noiDen;
    private int soNgayDiDuoc;

    public NgoaiThanh(int id, String nameOfDriver, String numberDrive, double sales, String noiDen, int soNgayDiDuoc) {
        super(id, nameOfDriver, numberDrive, sales);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public NgoaiThanh() {
        super();
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen ) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String toString() {
        return "NgoaiThanh{" +super.toString()+
                ",noiDen='" + noiDen + '\'' +
                ", soNgayDiDuoc=" + soNgayDiDuoc +
                '}';
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào nơi đến: ");
        this.noiDen = sc.nextLine();
        System.out.println("Nhập vào số ngày đi được : ");
        this.soNgayDiDuoc = sc.nextInt();
        sc.nextLine();

    }
    @Override
    public void output(){
        super.output();
        System.out.printf("%-20s %-10d\n",this.noiDen,this.soNgayDiDuoc);
    }


}
