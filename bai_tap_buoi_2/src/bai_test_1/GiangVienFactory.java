package bai_test_1;

public class GiangVienFactory {
    protected static GiangVien[]giangViens;
    static {
        giangViens = new GiangVien[3];
        giangViens[GiangVienType.Co_Huu] = new CoHuu();
        giangViens[GiangVienType.Ban_Co_Huu]= new BanCoHuu();
        giangViens[GiangVienType.Thinh_Giang]= new ThinhGiang();
    }
    public static GiangVien get(int type){
        return giangViens[type];
    }
}
