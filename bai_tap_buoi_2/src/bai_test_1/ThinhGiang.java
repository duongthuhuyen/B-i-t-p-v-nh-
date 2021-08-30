package bai_test_1;

import java.util.Scanner;

public class ThinhGiang extends GiangVien{

    private int soGioThinhGiang;
    private String hocKyGiangDay;

    @Override
    public int getSoGioDay(GiangVien giangVien) {
        return this.soGioThinhGiang;
    }

    public void setSoGioThinhGiang(int soGioThinhGiang) {
        this.soGioThinhGiang = soGioThinhGiang;
    }

    public String getHocKyGiangDay() {
        return hocKyGiangDay;
    }

    public void setHocKyGiangDay(String hocKyGiangDay) {
        this.hocKyGiangDay = hocKyGiangDay;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Số giờ thỉnh giảng: ");
        this.soGioThinhGiang = sc.nextInt();
        System.out.println("Học kỳ giảng dạy:");
        this.hocKyGiangDay = sc.nextLine();
    }

    @Override
    public double getLuong() {
        System.out.println("Lương trong 6 tháng: ");
        return 100000*this.soGioThinhGiang*0.9;
    }
}
