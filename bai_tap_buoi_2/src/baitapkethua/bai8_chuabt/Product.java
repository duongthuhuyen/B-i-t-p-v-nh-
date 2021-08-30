package baitapkethua.bai8_chuabt;

import java.util.Scanner;

public abstract class Product extends VatValue implements Evaluator{
    private String identity;
    private String name;
    private int inventory;// tồn kho
    private double price;
    private static int autoInscrease = 0;

    public Product(String identity, String name, int inventory,double price) {
        this.identity = identity;
        this.name = name;
        this.inventory = inventory;
        this.price = price;
    }

    public Product() {
        this.identity = "Product"+ autoInscrease++;
    }

    public String getIdentity() {
        return identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("name is not blank");
            System.exit(0);// thoát khỏi chương trình
        }
        this.name = name;
    }



    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        if(inventory <0){
            System.out.println("inventory is greater 0");
            System.exit(0);
        }
        this.inventory = inventory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<= 0){
            System.out.println("price is not less than 0");
            System.exit(0);
        }
        this.price = price;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên hàng: ");
        this.setName(sc.nextLine());
        System.out.println("Nhập vào số lượng tồn kho: ");
        this.setInventory(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập vào đơn giá: ");
        this.setPrice(sc.nextDouble());
        sc.nextLine();
        //return null;
    }
    public void output(){
        System.out.println("Mã số: "+this.identity);
        System.out.println("Tên hàng: "+this.name);
        System.out.println("Tồn kho: "+this.inventory);
        System.out.println("Đơn giá: "+this.price);
        System.out.println("Vat: "+this.getVat());
    }

    public abstract String valuate();

    //public abstract String valuate();

    //public abstract String valuate();
}
