package baitapkethua.bai8_chuabt;

import java.util.Scanner;

public class Test{


    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(3);
        productManager.input();
        productManager.output();
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập lựa chọn: ");
            int a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1:
                   // ProgramType.products[THEM_HANG_THUC_PHAM].input();
                    Food food = new Food();
                    food.input();
                    productManager.add(food);
                    break;
                case 2:
                   // ProgramType.products[THEM_HANG_DIEN_TU].input();
                    Electric electric = new Electric();
                    productManager.add(electric);
                    break;
                case 3:
                    //ProgramType.products[THEM_HANG_SANH_SU].input();
                    Crockery crokery = new Crockery();
                    productManager.add(crokery);
                    break;
                case 4:
                    productManager.output();
                    break;
                default:
                    System.out.println("The end_______________");
                    flag = false;
                    break;

            }
        }
            while (flag) ;


    }
}
