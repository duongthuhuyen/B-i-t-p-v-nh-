package baitapkethua.bai4;

//import baitapkethua.bai3.ListGiaoDich;

import java.text.ParseException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ListGDNhaDat lgd = null;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhập vào các giao dịch" +
                    "\n2. In ra các giao dịch" +
                    "\n3. Đếm tổng các giao dịch từng loại" +
                    "\n4. Tính trung bình thành tiền của giao dịch đất" +
                    "\n5. Xuất ra các giao dịch trong tháng 9 năm 2013");
            System.out.println("Nhập vào lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("Nhập vào số n: ");
                    lgd = new ListGDNhaDat(sc.nextInt());
                    lgd.Nhap();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("In ra các giao dịch: ");
                    lgd.Xuat();
                    break;
                case 3:
                    lgd.countGD();
                    break;
                case 4:
                    lgd.tbttgdd();
                    break;
                case 5:
                    try {
                        lgd.GDT9();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    flag = false;
                    System.out.println("The End__________");
                    break;
            }
        }while (flag);
    }
}
