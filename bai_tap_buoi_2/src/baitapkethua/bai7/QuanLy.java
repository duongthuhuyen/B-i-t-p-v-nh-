package baitapkethua.bai7;

public class QuanLy {
    private int f;
    private Person listPerson [] = null;
    private int n;

    public QuanLy(int f) {
        this.n = 0;
        this.f = f;
        listPerson = new Person[f];
        for(int i = 0;i<f;i++){
            listPerson[i] = new Person();
        }

    }
    public void insertPerson(int temp){
        if(this.n == this.f){
            this.f *= 2;
        }
        if(temp == 1){
            Student s = new Student();
            s.input();
            listPerson[n] = s;
            n++;
            System.out.println("Thêm 1 học sinh thành công");
        }else if(temp == 2){
            Employee e = new Employee();
            e.input();
            listPerson[n] = e;
            n++;
            System.out.println("Thêm 1 nhân viên thành công");
        }else if(temp == 3){
            Customer c = new Customer();
            c.input();
            listPerson[n] = c;
            n++;
            System.out.println("Thêm 1 khách hàng thành công");
        }else{
            System.out.println("Chưa thêm thành công!");
        }

    }
    public void deletePerson(String s){
       boolean t = true;
       for(int i = 0;i<n;i++){
           if(s.compareTo(listPerson[i].getName())== 0){
               for(int j = i;j<n;j++){
                   listPerson[j] = listPerson[j+1];

               }
               listPerson[n-1] = null;
               n--;
               t = false;
           }
       }
       if(t == true){
           System.out.println("Người này không tồn tại");
       }
    }
    public void Xuat(){
        for(int i = 0;i<n;i++){
            System.out.println(listPerson[i].toString());
            System.out.println();
        }
    }
    public void xapxep(){
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(listPerson[i].getName().compareTo(listPerson[j].getName())>0)
                {
                    Person a = listPerson[i];
                    listPerson[i] = listPerson[j];
                    listPerson[j] = a;
                }
            }
        }
    }
}
