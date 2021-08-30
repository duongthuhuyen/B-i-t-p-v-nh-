package staticdemo;

//import baitapvenhaoop_buoi1.bai7.SinhVien;

public class test {
    public static void main(String[] args) {
        //SinhVien sv1 = new SinhVien(1,"huyền");
       /* System.out.println(SV.schoolName);
        SV.schoolName = "Đại học phenikaa";
        SV sv = new SV(1,"a");
        System.out.println(sv);*/
        /*SV sv1 = SV.of(1,"huyền");
        SV sv2 = SV.of(2,"hằng");
        System.out.println(sv1);
        System.out.println(sv2);*/
        // SỬ LÝ THREAD đẻ vẫn đảm bảo singleton --> sử dụng synchonized
        /*for(int i= 0;i<2000;i++ ){
            new Thread(()->{
                SV sv = SV.of(1,"huyền");
                System.out.println(sv);
            }).start();
        }
    }*/
        SV sv1 = new SV(1,"h",3.12);
        SV sv2 = new SV(2,"a",3.14);
        SV sv3 = new SV(1.2);
        System.out.println(sv3.getPI());
    }

}
