package adapter_parrtern.vd2;

public class CosmeticProduct implements Product{

    private String name;
    private double price;

    public CosmeticProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
