package baitapkethua.bai1;

import java.util.Scanner;

public class ListChuyenXe {
    private ChuyenXe listCX[]= null;
    private int n;
    private double dt1 = 0;
    private double dt2 = 0;
    public ListChuyenXe(int n) {
        //this.listCX = listCX;
        this.n = n;
        this.listCX = new ChuyenXe[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        listCX = new ChuyenXe[n];
        for(int i = 0;i<n;i++){
            System.out.println("Số chẵn là xe nội thành , số lẻ là xe ngoại thành , mời lựa chọn:");
            int a = sc.nextInt();
            sc.nextLine();
            //listCX[i] = new NoiThanh();
            if(a%2 == 0){
                listCX[i] = new NoiThanh();
                listCX[i].input();
                dt1 += listCX[i].getSales();
            }else{
                listCX[i] = new NgoaiThanh();
                listCX[i].input();
                dt2 += listCX[i].getSales();
            }
            //listCX[i].input();
        }
    }

    public void Xuat(){
        for(ChuyenXe cx:listCX){
            cx.output();
        }
    }
    public void DoanhThu(){
        System.out.println("Doanh thu xe nội thành : "+this.dt1);
        System.out.println("Doanh thu xe ngoại thành : "+this.dt2);
    }
}
