package baitapkethua.bai8_chuabt;

import java.util.Scanner;

public class Electric extends Product{

    public Electric(String identity, String name, int inventory, double price) {
        super(identity, name, inventory, price);
    }
    private int warranty;
    private double wattage;

    public Electric() {

    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        if(warranty<0){
            System.out.println("warranty is greater 0");
            System.exit(0);
        }
        this.warranty = warranty;
    }

    public double getWattage() {
        return wattage;
    }

    public void setWattage(double wattage) {
        if(wattage<= 0){
            System.out.println("wattage is greater 0");
            System.exit(0);
        }

        this.wattage = wattage;
    }

    @Override
    public void input() {
        System.out.println("Hàng điện tử: ");
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Thời gian bảo hành: ");
        this.setWarranty(sc.nextInt());
        sc.nextLine();
        System.out.println("Công suất: ");
        this.setWattage(sc.nextDouble());
        sc.nextLine();
       // return null;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Thời gian bảo hành: "+this.warranty);
        System.out.println("Công suất: "+this.wattage);
    }

    @Override
    public double getVat() {
        return VatValue.vats[ELECTRIC];
    }

    @Override
    public String valuate() {
        if(this.getInventory()<3){
            return Evaluator.BAN_DUOC;
        }
        return Evaluator.KHONG_BAN_DUOC;
    }
}
