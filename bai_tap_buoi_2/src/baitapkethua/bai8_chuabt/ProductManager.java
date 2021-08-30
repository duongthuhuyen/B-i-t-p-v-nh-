package baitapkethua.bai8_chuabt;

public class ProductManager {
    private Product products[];
    private int n;

    public ProductManager(int n) {
        this.n = n;
        products = new Product[100];
    }

    public boolean add(Product product){
        if(n>= 100) return false;
        /*for(int i = 0;i<n;i++){
            if(products[i].getIdentity().equals(product.getIdentity())){
                return false;
            }
        }*/
       // products[n] = ProductFactory.get()


        products[n++]=product;
        return true;

    }

    public void input(){
        for(int i = 0;i<n;i++){
            if(i%3 == ProductType.FOOD){
                products[i] = ProductFactory.get(ProductType.FOOD);
            }else if(i%3 == 1){
                products[i] = ProductFactory.get(ProductType.ELECTRIC);
            }else if(i %3 == 2){
                products[i] = ProductFactory.get(ProductType.CROKERY);
            }
            products[i].input();
        }
    }

    public void output(){
        System.out.println("Xuất ra: ");
        System.out.println("______________________");
        for(int i = 0;i<n;i++){
            products[i].output();
            System.out.println("Đánh giá: "+products[i].valuate());

            System.out.println("______________________");

        }
    }


}
