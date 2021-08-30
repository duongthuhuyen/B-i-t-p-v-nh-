package baitapvenhaoop_buoi1.bai8;

import java.util.Scanner;

public class test {
    static int n ;
    static CD listCD[] = null;
    static Scanner sc = new Scanner(System.in);
    static void nhapCD(CD cd){
        boolean k = true;
        boolean t = true;
        System.out.println("Nhập vào mã CD: ");
        cd.setMaCD(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vao tên CD: ");
        cd.setTenCD(sc.nextLine());
        System.out.println("Nhap vao Ca sy: ");
        cd.setCasy(sc.nextLine());
        do{
            System.out.println("Nhap vao so lượng đĩa :");
            cd.setSoLuong(sc.nextInt());
            sc.nextLine();
        }while (cd.checkSL(t));
        do{
            System.out.println("Nhap vao đơn giá của đĩa: ");
            cd.setGia(sc.nextInt());
            sc.nextLine();
        }while (cd.checkGia(k));
    }
    static boolean check(CD cd){
        boolean t = true;
        if(listCD.length <= n){
            t = false;
        }
        for(CD cd1 :listCD){
            if(cd1.getMaCD()== cd.getMaCD()){
                t = false;
                break;
            }
        }
        return t;
    }
    static void insertCD(CD cd){
        if(check(cd)){
            listCD[n]= new CD();
            listCD[n]= cd;
            n++;

        }
    }
    static int SLCD(){
        int dem = 0;
        for(CD cd1:listCD){
            dem++;
        }
        return dem;
    }
    static double tongGia(){
        double s = 0;
        for(CD cd1:listCD){
            s+= (cd1.getGia()*cd1.getSoLuong());
        }
        return s;
    }
    static void Nhap(CD cd){
        System.out.println("Nhap vao maCD");

    }
    static void sortByNameASC(){
        for(int i = 0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(listCD[i].getTenCD().compareTo(listCD[j].getTenCD())>0){
                    CD temp = new CD();
                    temp = listCD[i];
                    listCD[i]=listCD[j];
                    listCD[j]=temp;
                }
            }
        }
    }
    static void sortByPriceDESC(){
        for(int i = 0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(listCD[i].getGia()<listCD[j].getGia()){
                    CD temp = new CD();
                    temp = listCD[i];
                    listCD[i]=listCD[j];
                    listCD[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        //n = 2;
        //listCD[] = new CD();
        boolean flag = true;
        do{
            System.out.println("Chon cac lua chon sau: ");
            System.out.println("1. Nhap vao dia CD\n"+
                    "2.In ra Danh sách đia CD\n"+
                    "3.Đếm số lượng đĩa CD\n"+
                    "4.Tính tổng số tiền của các đĩa CD\n"+
                    "5.Xắp xếp tăng dần theo tên của đĩa CD\n"+
                    "6.Xắp xếp giảm dần theo giá thành từng loại đĩa\n"+
                    "7.Thêm vào 1 đĩa ");
            System.out.println("Mời nhập lựa chọn: ");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Nhập vaò số lượng :");
                    n = sc.nextInt();
                    listCD = new CD[n];
                    for(int i = 0;i<n;i++){
                        listCD[i]= new CD();
                        //nha(listCD[i]);
                        nhapCD(listCD[i]);
                    }
                    break;
                case 2:
                    for(int i =0 ;i< listCD.length;i++){
                        listCD[i].hienthiCD();
                    }
                    break;
                case 3:
                    System.out.println("Số lượng CD : "+SLCD());
                    break;
                case 4:
                    System.out.println("Tổng tiền : "+tongGia());
                    break;
                case 5:
                    System.out.println("Xắp xếp tăng dần theo tên của đĩa: ");
                    sortByNameASC();
                    for(CD cd:listCD){
                        cd.hienthiCD();
                    }
                    break;
                case 6:
                    System.out.println("Xắp xếp giảm dần theo đơn giá: ");
                    sortByPriceDESC();
                    for(CD cd:listCD){
                        cd.hienthiCD();
                    }
                    break;
                case 7:
                    System.out.println("Thêm 1 CD vào ");
                    CD cd = new CD();
                    nhapCD(cd);
                    //boolean t = true;
                    do{
                        insertCD(cd);
                    }while (check(cd));
                    break;
                default:
                    System.out.println("BYe");
                    flag = false;
            }


        }while (flag);

    }
}
