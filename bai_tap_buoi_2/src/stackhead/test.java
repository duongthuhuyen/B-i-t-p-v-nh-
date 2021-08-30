package stackhead;

public class test {
    public static void main(String[] args) {
        String s1 = "   ";
        String s2 = "Huyen";
        String s3 = new String("Huyen");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(" "));
        System.out.println(s1.equalsIgnoreCase("huyen"));
        System.out.println(s1.compareToIgnoreCase("huyen"));
        System.out.println(s1.toCharArray());
        System.out.println(s1.concat(" a j"));
        System.out.println(s1.getBytes());
        System.out.println(s1.isEmpty());
        //System.out.println(s1.isBlank());
        //System.out.println(s1.isBlank());
        StringBuilder s4 = new StringBuilder();
        StringBuffer s5 = new StringBuffer();

        /**
         * khi khai báo s1 bằng "Huyền" nó sẽ khởi tạo ở vùng nhớ pool trên heap 1 giá trị "Huyền" và tên biến s1
         * lưu trữ ở stack sẽ trỏ đến ô nhớ này
         * khi khai báo s2 bằng "huyền" nó sẽ tìm trên pool có giá trị đó thì tên biến s2 lưu trữ trong stack sẽ trỏ đến ô nhwos đó
         * nên s1 == s2
         * s3, khi dùng new String("Huyền") thì nó sẽ tạo ra ô nhớ trong vùng heap ngoài vùng pool , 1 ô nhớ có giá trị "Huyền"
         * do đó s3!=s1
         * Note: == là để so sánh sự tham chiếu của đối tượng , sự giống nhau về vùng nhớ
         * Còn để so sánh về giá trị của String thì ta phải dùng từ khóa equal
         */
    }
}

