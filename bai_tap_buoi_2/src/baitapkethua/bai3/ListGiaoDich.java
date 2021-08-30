package baitapkethua.bai3;

import java.util.Scanner;

public class ListGiaoDich {
    private GiaoDich listGD[] = null;
    private int n;

    public ListGiaoDich(int n) {
        this.n = n;
        listGD = new GiaoDich[n];
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            System.out.println("Lựa chọn giao dich (1- nếu chọn giao dịch vàng" +
                    ",2-nếu chọn giao dịch tiền tệ):");
            int a = sc.nextInt();
            if(a == 1){
                listGD[i] = new GiaoDichVang();
            }
            if (a == 2){
                listGD[i] = new GiaoDichTienTe();
            }
            listGD[i].input();
        }
    }
    public void Xuat(){
        for(GiaoDich gd:listGD){
            gd.output();
        }
    }
    public void sumGD(){
        int sv = 0;
        int stt = 0;
        for(GiaoDich gd:listGD){
            if(gd instanceof GiaoDichVang){
                sv++;
            }else{
                stt++;
            }
        }
        System.out.println("Tổng số giao dịch vàng: "+sv);
        System.out.println("Tổng số giao dịch tiền tệ : "+stt);
    }
    public void TBCGDTT(){
        int stt = 0;
        double sumtt = 0;
        for(GiaoDich gd:listGD){
            if(gd instanceof GiaoDichTienTe){
                stt++;
                sumtt+= gd.ThanhTien();
            }
        }
        System.out.println("Trung bình cộng thành tiền của các giao dịch tiền tệ: "+sumtt/(double) stt);
    }
    public void xuattheoyc(){
        for(GiaoDich gd:listGD){
            if(gd.getDonGia()>1000000000.0){
                gd.output();
            }
        }
    }
}
