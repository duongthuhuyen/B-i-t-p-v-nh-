package adapter_parrtern.vd2;

public class Test {
    public static void main(String[] args) {


        ShopInventory inventory = new ShopInventory();
        inventory.addProduct(new CosmeticProduct("abc",123));
        inventory.addProduct(new GroceryItemAdapter(new GroceryItem("exo",111)));
        //inventory.showProduct();
        CosmeticProduct c = new CosmeticProduct("abc",123);
        inventory.addProduct(c);
        inventory.showProduct();
        inventory.removeProduct(c);
        inventory.showProduct();
    }

}
