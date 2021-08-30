package oop;

public class demo {
    /*
    oop: lấy đối tượng làm trung tâm
    - class là gì:là 1 khuôn mẫu để tạo ra đối tượng.
    Class được hình thành qua quá trình trừu tượng 1 tập các object có chung với nhau về mặt tính chất
    quá trình trừu tượng 1 tập object là tìm ra các thuộc tính và phương thức chung của các objectclass
    để đóng gói chúng lại vào trong 1
    - object là gì: là đối tượng được sinh ra bởi class .
    object mang trên mình 3 thông tin: định danh (là duy nhất) ,
                                       trạng thái (thuộc tính và giá trị của thuộc tính) ,
                                       hành vi (là các phương thức của object)
     --> Các object được tạo ra từ 1 class: chung vs nhau về mặt thuộc tính nhưng khác nhau về mặt giá trị
   , hành vi của các object là giống nhau nhưng kết quả sẽ khác nhau (vì khác nhau về mặt trạng thái)

   --> muốn thực hiện hành vi thông qua đối tượng , nếu ko nó sẽ null poiter

   - access modifier (phạm vi hoạt động của biến ) :
                    trong cùng class        khác class cùng packet          khác class, khác packetnhưng có quan hệ cha con         khác class, khác packet
   + public:
   + protected:
   + default:
   + private:
 ---> Đóng gói: các class nằm trong cùng 1 packet --> đóng gói
 --> các thuộc tính , phương thức nằm trong class --> đóng ggói .


 - Contructor:(cấu tử) để khởi tạo ra các giá trị ban đầu của thuộc tínhn của class . khi class chưa có 1 contructor nào
 --> chương trình mặc định tạo ra gí trij ban đầu là giá trị nguyên thủy
 + kiểu dữ liệu nguyên thủy --> 0
 + boolen -> false
 + các kiểu dữ liệu trừu tượng --> null
 


       */
    public class sinhvien{
        /*
        / Cách đặt tên: tên 1 class là danh từ / cụm danh từ
        Tên class : sẽ viết hoa các chữ cái đầu của các từu
        Tên thuộc tính giống tên claas
        tên phương thức: động từ / cụm động từ
        --> tên thuộc tính , phương thức : viết thường từ đầu tiên từ từ thứ 2 trở đi thì viết hoa chữ cái đầu
         */
        // để private thì bên ngoài class ko thể truy cập đến biến đó đc ngoài
        // --> những gì ở ngoài class thì ko thể nhìn thấy các giá trị của thuộc tính ra bên
        private String tensv;
        private String masosv;
        private int tuoi;
        private String address;


    }

    public static void main(String[] args) {
        //sinhvien sv = new sinhvien();
        // new để cung cấp 1 vùng nhớ cho đối tượng của class

    }
}
