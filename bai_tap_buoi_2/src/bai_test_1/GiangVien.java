package bai_test_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class GiangVien extends HocViValue{

    private String id;
    private String tenGiangVien;
    private LocalDate ngaySinh;
    private LocalDate ngayDuocNhan;
    private boolean nghiviec;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String date) {
        LocalDate day = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.ngaySinh = day;
    }

    public LocalDate getNgayDuocNhan() {
        return ngayDuocNhan;
    }

    public void setNgayDuocNhan(String ngayDuocNhan) {
        LocalDate day = LocalDate.parse(ngayDuocNhan, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.ngayDuocNhan = day;
    }

    public boolean isNghiviec() {
        return nghiviec;
    }

    public void setNghiviec(boolean nghiviec) {
        this.nghiviec = nghiviec;
    }

    /*  public GiangVien(GiangVienBuilder builder){
        this.id = builder.id;
        this.tenGiangVien = builder.tenGiangVien;
        this.ngayDuocNhan = builder.ngayDuocNhan;
        this.ngaySinh = builder.ngaySinh;

    }

    public abstract int getSoGioDay(CoHuu coHuu);

    public static class GiangVienBuilder{
        private String id;
        private String tenGiangVien;
        private LocalDate ngaySinh;
        private LocalDate ngayDuocNhan;

        public GiangVienBuilder id(String id) {
            this.id = id;
            return this;
        }

        public GiangVienBuilder tenGiangVien(String tenGiangVien) {
            this.tenGiangVien = tenGiangVien;
            return this;
        }

        public GiangVienBuilder ngaySinh(LocalDate ngaySinh) {
            this.ngaySinh = ngaySinh;
            return this;
        }

        public GiangVienBuilder ngayDuocNhan(LocalDate ngayDuocNhan) {
            this.ngayDuocNhan = ngayDuocNhan;
            return this;
        }

        public GiangVien build(){
            return new GiangVien(this);
        }
    }*/

    public class SoYeuLyLich{
        private String hoTen;
        private boolean gioiTinh;
        private String soDienThoai;
        private String email;
        private BangCap listBangCap[];

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getGioiTinh() {
            //0return gioiTinh;
            if(this.gioiTinh ==true){
                return "Nam";
            }
            return "Nữ";
        }

        public void setGioiTinh(boolean gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public String getSoDienThoai() {
            return soDienThoai;
        }

        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public BangCap[] getListBangCap() {
            return listBangCap;
        }

        public void setListBangCap(BangCap[] listBangCap) {
            this.listBangCap = listBangCap;
        }
        public void input(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Họ tên: ");
            this.setHoTen(sc.nextLine());
            System.out.println("Giới tính:\n" +
                    "(true: Nam,false:nữ)");
            this.gioiTinh= sc.nextBoolean();
            sc.nextLine();
            System.out.println("Số điện thoại:");
            this.setSoDienThoai(sc.nextLine());
            System.out.println("Email: ");
            this.setEmail(sc.nextLine());
            System.out.println("Số lượng bàng cấp: ");
            int n = sc.nextInt();
            sc.nextLine();
            listBangCap= new BangCap[n];
            System.out.println("Bằng cấp :");
            for(int i = 0;i<n;i++){
                listBangCap[i].input();
            }
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mã giảng viên: ");
        this.id =  sc.nextLine();
        System.out.println("Ngày sinh:");
        this.setNgaySinh(sc.nextLine());
        System.out.println("Ngày được nhận :");
        this.setNgayDuocNhan(sc.nextLine());
        System.out.println("Nghỉ việc:");
        sc.nextBoolean();
        sc.nextLine();

    }

}
