package baitapkethua.bai1;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ListChuyenXe lcs = null;
        //lcs.Nhap();
        //lcs.Xuat();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Mời nhập vào các lựa chọn : ");
            System.out.println("1. NHập \n2. Xuât \n3. In ra tổng doanh thu 2 loại xe\n");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a){
                case 1:
                    System.out.println("Nhập vào số lượng xe: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    lcs = new ListChuyenXe(n);
                    lcs.Nhap();
                    break;
                case 2:
                    System.out.println("In ra danh sách các xe :");
                    lcs.Xuat();
                    break;
                case 3:
                    System.out.println("In ra tổng doanh thu của các loại xe:");
                    lcs.DoanhThu();
                    break;
                default:
                    System.out.println("The end________");
                    flag = false;
                    break;
            }



        }while (flag);
    }
}
