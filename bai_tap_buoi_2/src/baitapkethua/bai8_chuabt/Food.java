package baitapkethua.bai8_chuabt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Food extends Product{
    private LocalDate inputDate;
    private LocalDate expiredDate;

    public Food(String identity, String name, int inventory, double price) {
        super(identity, name, inventory, price);
    }

    public Food() {
        super();
    }

    public LocalDate getInputDate() {
        return inputDate;
    }

    public void setInputDate(LocalDate inputDate) {
        this.inputDate = inputDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    @Override
    public  void input() {
        System.out.println("Hàng thực phẩm: ");
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngày nhập: ");
        String inputDate = sc.nextLine();
        this.inputDate = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Ngày hết hạn: ");
        String outputDate = sc.nextLine();
        this.expiredDate = LocalDate.parse(outputDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        if(this.expiredDate.isBefore(this.inputDate)){
            System.out.println("the expiredate is later than the inputDate");
            System.exit(0);
        }
      //  return null;
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Ngày nhập: "+this.inputDate);
        System.out.println("Ngày hết hạn: "+this.expiredDate);
    }

    @Override
    public double getVat() {
        return VatValue.vats[FOOD];
    }

    @Override
    public String valuate() {
        if(this.getInventory()>0 && LocalDate.now().compareTo(this.expiredDate)>0){
            return Evaluator.KHO_BAN;
        }
        return Evaluator.DE_BAN;
    }
}
