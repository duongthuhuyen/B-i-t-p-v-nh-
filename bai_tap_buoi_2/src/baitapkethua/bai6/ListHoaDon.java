package baitapkethua.bai6;

//import baitapkethua.bai4.ListGDNhaDat;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ListHoaDon {
    private HoaDon listhd [] = new HoaDon[100];
    private int i ;
   // private int n;
    public ListHoaDon(){
        i = 0;
        for(int j = 0;j<100;j++){
            listhd[j] = new HoaDon();
        }
    }

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        if( i>100) {
            System.out.println("Dừng nhập");
        }else{

            System.out.println("Mời nhập lựa chọn (1. Hóa đơn theo giờ " +
                    "2.Hóa đơn theo ngày)");
            int a = sc.nextInt();
            if (a == 1) {
                listhd[i] = new HoaDonTheoGio();
                HoaDonTheoGio s = new HoaDonTheoGio();
                s.input();

                if(s.getSoGioThue()>30){
                    listhd[i] = new HoaDon();
                    System.out.println("Không sử dụng hóa đơn này");
                }else{
                    listhd[i] = s;
                    i++;
                }

            } else if (a == 2) {
                listhd[i] = new HoaDonTheoNgay();
                HoaDonTheoNgay m = new HoaDonTheoNgay();
                m.input();
                listhd[i] = m;
                i++;
            }
            }
        }
        public void Xuat(){
        for(int j = 0;j<i;j++){
            listhd[j].output();
        }
        }
        public void Count(){
        int chdn = 0;
        int chdg = 0;
            for(int j = 0;j<i;j++){
                if(listhd[j] instanceof HoaDonTheoNgay){
                    chdn ++;
                }else{
                    chdg++;
                }
            }
            System.out.println("Số hóa đơn theo ngày : "+chdn);
            System.out.println("Số hóa đơn theo giờ: "+chdg);
        }
        public void TBCHD() throws ParseException {

                Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2013");
                Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse("30/09/2013");

            double s = 0;
            for(int j = 0;j<i;j++){
                if(listhd[j].getDayOfThue().compareTo(d1)>= 0 && listhd[j].getDayOfThue().compareTo(d2)<= 0){
                    s+= listhd[j].thanhTien();
                }
            }
            NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("vi","VN"));
            String g = numberFormat.format(s);
            System.out.println("Tổng thành tiền của các hóa đơn trong tháng 9 năm 2013: "+g);
        }
}

