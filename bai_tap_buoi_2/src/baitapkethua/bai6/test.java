package baitapkethua.bai6;

//import baitapkethua.bai4.ListGDNhaDat;

import java.text.ParseException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ListHoaDon lgd = new ListHoaDon();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1. Nhập vào các giao dịch" +
                    "\n2. In ra các giao dịch" +
                    "\n3. Đếm tổng các hóa đơn từng loại" +
                    "\n4. Tính tổng thành tiền các hóa đơn tháng 9 năm 2013");
            System.out.println("Nhập vào lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    //System.out.println("Nhập vào số n: ");
                    //lgd = new ListHoaDon();
                    lgd.Nhap();
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("In ra các giao dịch: ");
                    lgd.Xuat();
                    break;
                case 3:
                   // lgd.countGD();
                    lgd.Count();
                    break;
                case 4:
                    try {
                        lgd.TBCHD();
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    //lgd.tbttgdd();
                    break;

                default:
                    flag = false;
                    System.out.println("The End__________");
                    break;
            }
        }while (flag);
    }
}
