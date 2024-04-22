import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodProduct extends Product {

    private LocalDate expiryDate;
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public FoodProduct(String name, int quantity, LocalDate expiryDate) {
        super(name, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Expiry date: " + expiryDate.format(formatter) + ".");
    }
}
