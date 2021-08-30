package baitapkethua.bai10;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private String addres;

    public Person(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Addres: ");
        this.addres = sc.nextLine();
    }

    public void choseForChange(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //return a;
    }

  public void change(Person person){

    }

    //public abstract void change(Student student);
}
