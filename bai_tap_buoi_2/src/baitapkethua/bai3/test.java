package baitapkethua.bai3;

import baitapkethua.bai2.ListOfBook;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ListGiaoDich lgd = null;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhập vào các giao dịch" +
                    "\n2. In ra các giao dịch" +
                    "\n3. Đếm tổng các giao dịch từng loại" +
                    "\n4. Tính trung bình thành tiền của giao dịch tiền tệ" +
                    "\n5. Xuất ra các giao dịch có đơn giá > 1 tỷ.");
            System.out.println("Nhập vào lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("Nhập vào số n: ");
                    lgd = new ListGiaoDich(sc.nextInt());
                    lgd.Nhap();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("In ra các giao dịch: ");
                    lgd.Xuat();
                    break;
                case 3:
                    lgd.sumGD();
                    break;
                case 4:
                    lgd.TBCGDTT();
                    break;
                case 5:
                    lgd.xuattheoyc();
                    break;
                default:
                    flag = false;
                    System.out.println("The End__________");
                    break;
            }
        }while (flag);
    }
}
