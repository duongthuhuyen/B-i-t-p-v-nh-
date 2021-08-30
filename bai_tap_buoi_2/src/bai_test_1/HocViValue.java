package bai_test_1;

public abstract class HocViValue implements HocVi{
    protected static String listHocVi[];


    static {
        listHocVi = new String[5];
        listHocVi[GiangVienType.Cu_Nhan]= "Cử Nhân";
        listHocVi[GiangVienType.Thac_Si] = "Thạc sĩ";
        listHocVi[GiangVienType.Tien_Si]= "Tiến sĩ";
        listHocVi[GiangVienType.Pho_Giao_Su]="Phó giáo sư";
        listHocVi[GiangVienType.Giao_Su]= "Giáo sư";
    }

    @Override
    public String getHocVi() {
        return null;
    }

    @Override
    public int getSoGioDay(GiangVien giangVien) {
        return 0;
    }
}