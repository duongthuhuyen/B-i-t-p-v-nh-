package bai_test_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BangCap {
    private String tenTruongCap;
    private LocalDate namCap;
    private String hocVi;

    public String getTenTruongCap() {
        return tenTruongCap;
    }

    public void setTenTruongCap(String tenTruongCap) {
        this.tenTruongCap = tenTruongCap;
    }

    public LocalDate getNamCap() {
        return namCap;
    }

    public void setNamCap(String namCap) {
        LocalDate day = LocalDate.parse(namCap, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        this.namCap = day;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(int type) {
        this.hocVi = HocViValue.listHocVi[type];
    }

    public BangCap(BangCapBuilder builder) {
        this.tenTruongCap = builder.tenTruongCap;
        this.namCap =builder.namCap;
        //this.hocVi = builder.hocVi;

    }

    public class BangCapBuilder{
        private String tenTruongCap;
        private LocalDate namCap;
       // private String hocVi;

        public BangCapBuilder tenTruongCap(String tenTruongCap) {
            this.tenTruongCap = tenTruongCap;
            return this;
        }

        public BangCapBuilder setNamCap(LocalDate namCap) {
            this.namCap = namCap;
            return this;
        }



        public BangCap build(){
            return new BangCap(this);
        }
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên trường cấp: ");
        this.tenTruongCap = sc.nextLine();
        System.out.println("Ngày cấp: ");
        this.setNamCap(sc.nextLine());
        System.out.println("0_Cử nhân\n" +
                "1_Thạc sĩ\n" +
                "2_Tiến sĩ\n" +
                "3.Phó giáo sư\n" +
                "4.Giáo sư");
        System.out.println("Học vi: ");
        this.setHocVi(sc.nextInt());
        sc.nextLine();

    }
}
