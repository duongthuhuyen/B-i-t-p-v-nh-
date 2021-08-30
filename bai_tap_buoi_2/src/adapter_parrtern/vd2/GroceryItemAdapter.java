package adapter_parrtern.vd2;

public class GroceryItemAdapter implements Product{
    private GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem groceryItem) {
        this.groceryItem = groceryItem;
    }

    @Override
    public double getPrice() {
        return groceryItem.costPerUnit;
    }

    @Override
    public String getName() {
        return groceryItem.itemName;
    }
}
