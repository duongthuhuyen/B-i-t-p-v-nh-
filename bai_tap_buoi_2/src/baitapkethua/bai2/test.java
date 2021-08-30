package baitapkethua.bai2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ListOfBook lsb = null;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Mời nhập lựa chọn :");
            System.out.println("1. Nhập vào các dầu sách \n2. Xuất ra các đầu sách\n3. Tính tổng thành tiền cho từn loại" +
                    "\n4. Tính trung bình cộng đơn giá của các sách tham khảo" +
                    "\n5. Xuất ra SGK của 1 nhà xuất bản");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                    System.out.println("Mời bạn nhập vào số loại sách : ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    lsb = new ListOfBook(n);
                    lsb.Nhap();
                    break;
                case 2:
                    System.out.println("Xuất ra các đầu sách :");
                    lsb.Xuat();
                    break;
                case 3:
                    lsb.TongTien();
                    break;
                case 4:
                    lsb.TinhTongTBCOfSTK();
                    break;
                case 5:
                    System.out.println("Nhập vào tên NXB:");
                    String s = sc.nextLine();
                    lsb.XuatTheoNXB(s);
                    break;
                default:
                    System.out.println("The End_________");
                    flag = false;
                    break;
            }


        }while (flag);
    }
}
