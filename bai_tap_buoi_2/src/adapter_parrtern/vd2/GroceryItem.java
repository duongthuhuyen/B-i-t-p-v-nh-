package adapter_parrtern.vd2;

public class GroceryItem {
    String itemName;
    double costPerUnit;

    public GroceryItem(String itemName, double costPerUnit) {
        this.itemName = itemName;
        this.costPerUnit = costPerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }
}
