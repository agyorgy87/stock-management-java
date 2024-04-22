import java.time.LocalDate;
import java.util.logging.*;

public class StockManagement {
    private static final Logger LOGGER = Logger.getLogger(StockManagement.class.getName());
    public static void main(String[] args) {

        Shop shop = new Shop();

        FoodProduct milk = new FoodProduct("milk", 3, LocalDate.of(2024,7,5));
        FoodProduct cheese = new FoodProduct("Trappist", 5, LocalDate.of(2024,8,9));
        FoodProduct bread = new FoodProduct("White Bread", 20, LocalDate.of(2024,6,18));
        //shop.addProduct(milk);
        //shop.addProduct(cheese);
        //shop.addProduct(bread);

        ElectronicProduct asusLaptop = new ElectronicProduct("Asus TUF 505DT", 9, 2);
        ElectronicProduct samsungTv = new ElectronicProduct("Samsung 4K QLED", 5, 3);
        ElectronicProduct lgTv = new ElectronicProduct("LG 4K OLED", 15, 2);
        shop.addProduct(asusLaptop);
        shop.addProduct(samsungTv);
        shop.addProduct((lgTv));


        //EmptyListException
        try {
            int countFoodProduct = shop.countFoodProduct();
            LOGGER.info("Food product: " + countFoodProduct);
            //shop.countElectronicProduct();
            //shop.avgProductStock();
            //shop.findProductsAboveStockLevel(21);
            //shop.findElectronicProductsAboveWarrianty(1);
            //shop.avgElectronicProductQuantity();
            //shop.findAllElectronicProduct();
            //shop.minQuantityProduct();
        } catch(Exception e) {
            LOGGER.warning(e.getMessage());
        }

        //NameNotFoundException
        try {
            shop.findProductByName("trappist");
        } catch(NameNotFoundException e) {
            System.out.println(e.getMessage());
        }

        shop.display();

        /*
        FoodProduct milk = new FoodProduct("Not to milk", 10, "2024.07.05");
        FoodProduct gorgonzola = new FoodProduct("Gorgonzola", 20, "2024.06.05");
        ElectronicProduct asusLaptop = new ElectronicProduct("Asus TUF 505DT", 3, 2);
        ElectronicProduct samsungTv = new ElectronicProduct("Samsung 4K QLED", 5, 3);

        //add and sell
        milk.addStock(5);//done
        milk.display();
        gorgonzola.sellStock(21);
        gorgonzola.display();
        asusLaptop.addStock(1);
        asusLaptop.display();
        samsungTv.sellStock(2);
        samsungTv.display();
        */
    }
}