package baitapvenhaoop_buoi1.bai4;

public class test{
    public static void main(String[] args) {
        Account acc1 = new Account(1234567,"Duong thi thu huyen");
        Account acc2 = new Account(2612201,"Ho Thi Phuong",100);
        Account acc3 = new Account();
        acc3.setSoTK(1801204);
        acc3.setTenTK("Duong Thu Hang");
        acc3.setTienTK(200);
        acc1.napTienTK(300000000);
        System.out.println("Tien trong tk cua acc1: "+acc1.getTienTK());
        acc2.rutTienTK(20,1);
        System.out.println("Tien trong tai khoan acc2: "+acc2.getTienTK());
        acc1.chuyenKhoan(acc3,100,2);
        System.out.println("Tien trong tk acc1 : "+acc1.getTienTK());
        System.out.println("Tien trong Tk acc3: "+acc3.getTienTK());
        System.out.println(acc1.toString());
    }
}

