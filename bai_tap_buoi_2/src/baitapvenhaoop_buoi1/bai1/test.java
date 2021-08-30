package baitapvenhaoop_buoi1.bai1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        double cd , cr;
        Scanner sc = new Scanner(System.in);
        cd = sc.nextDouble();
        cr = sc.nextDouble();
        hcn.setChieuDai(cd);
        hcn.setChieuRong(cr);
        System.out.print(hcn.toString());
    }
}
