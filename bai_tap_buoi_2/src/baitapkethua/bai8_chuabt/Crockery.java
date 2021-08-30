package baitapkethua.bai8_chuabt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Crockery extends Product{

    public Crockery(String identity, String name, int inventory, double price) {
        super(identity, name, inventory, price);
    }
    private LocalDate inputDate;
    private String produce;

    public Crockery() {

    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    @Override
    public void input() {
        System.out.println("Hàng sành sứ: ");
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày nhập: ");
        String date = sc.nextLine();
        this.inputDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nhà sản xuất: ");
        this.produce = sc.nextLine();
       // return null;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngày nhập: "+this.inputDate);
        System.out.println("Nhà sản xuất :"+this.produce);
    }

    @Override
    public double getVat() {
        return VatValue.vats[CROKERY];
    }

    @Override
    public String valuate() {
        if(this.getInventory()>50 && LocalDate.now().compareTo(this.inputDate)>10){
            return Evaluator.BAN_CHAM;
        }
        return Evaluator.BAN_CHAY;
    }
}
