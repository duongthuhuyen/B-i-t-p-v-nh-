package baitapkethua.bai4;

import baitapkethua.bai3.GiaoDich;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ListGDNhaDat {
    private GiaoDichND listgd [] = null;
    private int n;

    public ListGDNhaDat(int n) {
        this.n = n;
        listgd = new GiaoDichND[n];
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            System.out.println("Lựa chọn giao dịch " +
                    "(1-giao dịch nhà , 2-giao dịch đất)");
            int a = sc.nextInt();
            if(a == 1){
                listgd[i] = new GiaoDichNha();
            }else if (a == 2){
                listgd[i] = new GiaoDichDat();
            }
            listgd[i].input();
        }
    }
    public void Xuat(){
        System.out.println("Giao dịch Nhà :");
        //System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n","Mã GD","Ngày GD","Đơn giá","diện tích","Loại nhà","Địa chỉ");
        for(GiaoDichND gd:listgd){
            if(gd instanceof GiaoDichNha){
                gd.output();
            }

        }
        System.out.println("Giao dịch Đất :");
       // System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n","Mã GD","Ngày GD","Đơn giá","diện tích","Loại đất");
        for(GiaoDichND gd:listgd){
            if(gd instanceof GiaoDichDat){
                gd.output();
            }

        }

    }
    public void countGD(){
        int sn = 0;
        int sd = 0;
        for(GiaoDichND gd:listgd){
            if(gd instanceof GiaoDichNha){
               sn++;
            }
            if(gd instanceof GiaoDichDat){
                sd ++;
            }

        }
        System.out.println("tổng số giao dịch nhà: "+sn);
        System.out.println("Tổng giao dịch đất : "+sd);
    }
    public void tbttgdd(){
        double s = 0;
        int sd = 0;
        for(GiaoDichND gd:listgd){
            if(gd instanceof GiaoDichDat){
                s+= gd.thanhTien();
                sd ++;
            }

        }
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println("TRung bình cộng thàn tiền của các giao dịch đất: "+numberFormat.format(s/(double) sd));
    }
    public void GDT9() throws ParseException {
        //String stringDate = "1/9/2013";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2013");
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse("30/09/2013");
        for(GiaoDichND gd:listgd){
            if(gd.getDayOfGD().compareTo(date1)>= 0 && gd.getDayOfGD().compareTo(date2)<= 0){
                gd.output();
            }
        }
    }
}
