package baitapkethua.bai1;

import java.util.Scanner;

public class NoiThanh extends ChuyenXe{


    public NoiThanh(int id, String nameOfDriver, String numberDrive, double sales) {
        super(id, nameOfDriver, numberDrive, sales);
    }
    private int soTuyen;
    private double soKM;

    public NoiThanh(int id, String nameOfDriver, String numberDrive, double sales, int soTuyen, double soKM) {
        super(id, nameOfDriver, numberDrive, sales);
        this.soTuyen = soTuyen;
        this.soKM = soKM;
    }

    public NoiThanh() {
        super();
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKM() {
        return soKM;
    }

    public void setSoKM(double soKM) {
        this.soKM = soKM;
    }

    @Override
    public String toString() {
        return "NoiThanh{" +super.toString()+
                ",soTuyen=" + soTuyen +
                ", soKM=" + soKM +
                '}';
    }
    @Override
    public void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào Số tuyến :");
        this.soTuyen =sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào số km đi được :");
        sc.nextDouble();
        sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.printf("%-10d %-10.2f\n",this.soTuyen,this.soKM);
    }
}
