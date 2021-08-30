package baitapvenhaoop_buoi1.bai2;

//import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(001,"Duong huyen",9,9);
        SinhVien sv2 = new SinhVien(002,"Trinh Tuyet",9,9);
        SinhVien sv3 = new SinhVien();
        Scanner sc = new Scanner(System.in);
        int masv =sc.nextInt();
        String tensv = sc.next();
        float diemlt = sc.nextFloat();
        float diemthuchanh = sc.nextFloat();
        sv3.setMaSV(masv);
        sv3.setHovaten(tensv);
        sv3.setDiemLT(diemlt);
        sv3.setDiemTH(diemthuchanh);
        //System.out.println("%d %-30s %5.2f %5.2f",sv1.getMaSV(),sv1.getHovaten(),sv1.getDiemLT(),sv1.getDiemTH());


    }
}
