package bai_test_1;

public class ListGiangVien {
    private GiangVien listGV [];
    private int k;
    public ListGiangVien(int k){
        this.k = k;
        listGV = new GiangVien[100];
    }
    public boolean add(GiangVien giangVien){
        if(k>=100){
            return false;
        }
        listGV[k++]= giangVien;
        return true;
    }
}
