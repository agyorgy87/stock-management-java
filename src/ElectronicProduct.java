public class ElectronicProduct extends Product {

    private int warranty;

    public ElectronicProduct(String name, int quantity, int warranty) {
        super(name, quantity);
        this.warranty = warranty;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("warranty: " + warranty);
    }
}
