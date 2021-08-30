package nested_class;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public static class nesteddegree{
        private int year;

        public int getYear() {
            return year;
        }
    }
    public class degree{
        private int age;


    }
    public interface interf{

    }
    public static void main(String[] args) {
        Student student = new Student();
        degree de = student.new degree();
        System.out.println(de.age);
       // System.out.println(((Student) de.getName() ));
        nesteddegree nes= new Student.nesteddegree();
        System.out.println(de);
        System.out.println(nes);
        Idemo idemo = new Idemo() {
            @Override
            public void input() {
                System.out.println("hello");
            }
        };
   idemo.input();
    }
}
