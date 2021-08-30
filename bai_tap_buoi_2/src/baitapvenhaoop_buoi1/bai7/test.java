package baitapvenhaoop_buoi1.bai7;

import java.util.Scanner;

public class test {
    static int n;
    static SinhVien listSV[] = null;
    static Scanner sc = new Scanner(System.in);
    static void NHapSV(SinhVien sv){
        System.out.println("NHap ma SV: ");
        sv.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten sv: ");
        sv.setHoTen(sc.nextLine());
        //sc.nextLine();
        System.out.println("Nhap vao dia chi:");
        sv.setDiaChi(sc.nextLine());
        //sc.nextLine();
        Boolean t = true;
        do{
            System.out.println("Nhap vao SDT:");
            sv.setSDT(sc.nextInt());
            sc.nextLine();
        }while (sv.checkSDT(t));
    }
    public static void main(String[] args) {
        boolean flag = true;
        do{
            System.out.println("2 lua chon:");
            System.out.println("1. Nhap vao mang sinh vien");
            System.out.println("2. In ra danh sach sinh vien");
            System.out.println("Moi ban nhap lua chon: ");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Nhap vao so luong sinh vien");
                     n = sc.nextInt();
                   // SinhVien listSV[] = new SinhVien[n];
                    listSV = new SinhVien[n];
                    //System.out.println(listSV.length);
                    for(int i = 0;i<n;i++){
                        System.out.println("Nhap vao sinh vien thu "+(i+1));
                        listSV[i] = new SinhVien();
                        NHapSV(listSV[i]);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach Sinh vien: ");
                    for(int i = 0;i<n;i++){
                        for(int j = i+1;j<n;j++){
                            if(listSV[j].getMaSV()<listSV[i].getMaSV()){
                                SinhVien x = listSV[j];
                                listSV[j] = listSV[i];
                                listSV[i] = x;
                            }
                        }
                    }
                    for (SinhVien sv :listSV){
                        sv.hienThiTT();
                    }
                    break;
                default:
                    System.out.println("KT CT");
                    flag=false;
                    break;
            }


        }while (flag);

    }
}
