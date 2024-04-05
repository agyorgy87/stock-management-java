public class FoodProduct extends Product {

    private String expiryDate;

    public FoodProduct(String name, int quantity, String expiryDate) {
        super(name, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("expiry data: " + expiryDate);
    }
}
