package baitapvenhaoop_buoi1.bai6;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        HangThucPham htp = new HangThucPham();
        Scanner sc = new Scanner(System.in);
        boolean kt = true;
        boolean th = true;
        System.out.println("Nhap vao ma san pham");
        htp.setMaHang(sc.nextInt());
        sc.nextLine();
        do{
            System.out.println("Nhap ten hang");
            htp.setTenHang(sc.next());

        }while(htp.checkTenHang(th));
        System.out.println("Nhap vao don giá :");
        htp.setDonGia(sc.nextDouble());
        do{
            System.out.println("Nhap vao nam , thang , ngay san xuat :");
            htp.setNSX(sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println("Nhap vao nam, thang , ngay han su dung :");
            htp.setHSD(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }while(htp.checkNgay(kt));
        System.out.println(htp);
        htp.checkHSD();

    }
}
