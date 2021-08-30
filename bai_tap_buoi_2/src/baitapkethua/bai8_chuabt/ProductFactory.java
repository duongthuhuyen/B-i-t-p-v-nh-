package baitapkethua.bai8_chuabt;

public class ProductFactory implements ProductType{
    protected static Product []products;
    static {
        products = new Product[3];
        products[FOOD] = new Food();
        products[ELECTRIC]= new Electric();
        products[CROKERY]= new Crockery();
    }
    public static Product get(int type){
        return products[type];
    }
}
