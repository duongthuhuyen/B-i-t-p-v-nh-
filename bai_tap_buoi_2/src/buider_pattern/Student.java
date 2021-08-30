package buider_pattern;

public class Student {
    private String name;
    private String id;
    private int age;
    private double price;
    private String degree;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public String getDegree() {
        return degree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.age = builder.age;
        this.price = builder.price;
        this.degree = builder.degree;
    }

    public static class StudentBuilder {
        private String name;
        private String id;
        private int age;
        private double price;
        private String degree;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder id(String id) {
            this.id = id;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder price(double price) {
            this.price = price;
            return this;
        }

        public StudentBuilder degree(String degree) {
            this.degree = degree;
            return this;
        }

        public Student build(){
            return new Student(this);
        }


    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", price=" + price +
                ", degree='" + degree + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder().age(1).build();
        System.out.println(student);
    }
}
