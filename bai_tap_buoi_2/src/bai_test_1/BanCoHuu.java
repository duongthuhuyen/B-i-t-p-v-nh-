package bai_test_1;

public class BanCoHuu extends GiangVien{
    @Override
    public int getSoGioDay(GiangVien giangVien) {
        if(giangVien.getHocVi()=="Cử nhân"|| giangVien.getHocVi()=="Thạc sĩ"){
            return 46*3;
        }
        return 56*3;
    }

    @Override
    public double getLuong() {
        return -1;
    }
}
