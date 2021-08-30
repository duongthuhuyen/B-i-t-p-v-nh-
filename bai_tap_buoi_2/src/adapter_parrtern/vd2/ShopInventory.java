package adapter_parrtern.vd2;

import java.util.ArrayList;
import java.util.List;

public class ShopInventory {
    private List<Product> products;

    public ShopInventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product){
        this.products.remove(product);
    }
    public void showProduct(){
        for(Product p:products){
            System.out.println(p.getName()+" "+p.getPrice());
        }
    }
}