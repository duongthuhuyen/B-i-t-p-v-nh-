package baitapkethua.bai7;

import baitapkethua.bai3.ListGiaoDich;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        QuanLy listps = new QuanLy(10);
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Them 1 hoc sinh" +
                    "\n2. Them 1 nhan vien " +
                    "\n3. Them 1 khach hang" +
                    "\n4. in ra danh sach" +
                    "\n5. xoa 1 nguoi"+
                    "\n6. Xap xep theo ho ten: ");
            System.out.println("Nhập vào lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    //System.out.println("Nhập vào số n: ");
                    //listps = new QuanLy(10);
                    listps.insertPerson(1);
                    //sc.nextLine();
                    break;
                case 2:
                    //System.out.println("In ra các giao dịch: ");
                    listps.insertPerson(2);
                    break;
                case 3:
                    listps.insertPerson(3);
                    break;
                case 4:
                    listps.Xuat();
                    break;
                case 5:
                    System.out.println("Nhap vao ten nguoi muon xoa");
                    String s = sc.nextLine();
                    listps.deletePerson(s);
                    break;
                case 6:
                    listps.xapxep();
                    break;
                default:
                    flag = false;
                    System.out.println("The End__________");
                    break;
            }
        }while (flag);
    }
}
