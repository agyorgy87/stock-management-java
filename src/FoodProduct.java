import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodProduct extends Product {

    private LocalDate expiryDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

    public FoodProduct(String name, int quantity, String expiryDate) {
        super(name, quantity);
        this.expiryDate = LocalDate.parse(expiryDate, formatter);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Expiry date: " + expiryDate.format(formatter) + ".");
    }
}
