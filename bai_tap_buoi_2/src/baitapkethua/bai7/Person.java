package baitapkethua.bai7;

import java.util.Scanner;

public class Person {
    private String name;
    private String addres;

    public Person() {
    }

    public Person(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                '}';
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào họ và tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        this.addres = sc.nextLine();
    }
}
