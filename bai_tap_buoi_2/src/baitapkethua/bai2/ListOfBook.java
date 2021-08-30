package baitapkethua.bai2;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ListOfBook {
    private Book listBook [] = null;
    private int n;

    public ListOfBook(int n) {
        this.n = n;
        this.listBook = new Book[n];
    }

    public Book[] getListBook() {
        return listBook;
    }

    public void setListBook(Book[] listBook) {
        this.listBook = listBook;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        listBook = new Book[n];
        for(int i = 0;i<n;i++){
            System.out.println("Chon loại sách để nhập (Số lẻ là SGK, số chẵn nhâp STK):");
            int a = sc.nextInt();
            sc.nextLine();
            if(a%2 == 1){
                listBook[i] = new SGK();
            }else{
                listBook[i] = new SachThamKhao();
            }
            listBook[i].input();
        }
    }
    public void Xuat(){
        for(Book b: listBook){
           b.output();
        }
    }
    public void TongTien(){
        double sumSGK = 0;
        double sumSTK = 0;
        for(Book b: listBook){
            if(b instanceof SGK){
                sumSGK += b.thanhTien();
            }else{
                sumSTK += b.thanhTien();
            }
        }
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        String sgk = numberFormat.format(sumSGK);
        String stk = numberFormat.format(sumSTK);
        System.out.println("Tổng tiền loại SGK: "+sgk);
        System.out.println("Tổng tiền loại STK: "+stk);

    }
    public void TinhTongTBCOfSTK(){
        int a = 0;
        double s = 0;
        for(Book b:listBook){
            if(b instanceof SachThamKhao){
                a++;
                s+= b.getDonGia();
            }
        }
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        String tbc = numberFormat.format(s/(double) a);
        System.out.println("Trung bình cộng đơn giá các đầu sách tham khảo : "+tbc);
    }
    public void XuatTheoNXB(String s){
        int kt = 0;
        System.out.println("Danh sách các cuốn sách cùng nhà xuất bản");
        for(Book b:listBook)
            if((b instanceof SGK) && (b.getNXB().compareToIgnoreCase(s) == 0)){
                b.output();
                kt = 1;
            }
        if(kt == 0){
            System.out.println("Không xác định");
        }
        }

    }

