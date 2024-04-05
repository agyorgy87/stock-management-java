import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> productsRepository;

    public Shop() {
        this.productsRepository = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsRepository.add(product);
        System.out.println("Product added to the shop.");
    }

    //count all food product
    public void countFoodProduct() {
        int foodProductQuantity = 0;
        for(Product foodProduct : productsRepository) {
            if(foodProduct instanceof FoodProduct) {
                foodProductQuantity++;
            }
        }
        System.out.println("Number of food products: " + foodProductQuantity);
    }

    //count all electronic product
    public void countElectronicProduct() {
        int electronicProductQuantity = 0;
        for(Product electronicProduct : productsRepository) {
            if(electronicProduct instanceof ElectronicProduct) {
                electronicProductQuantity++;
            }
        }
        System.out.println("Number of electronic products: " + electronicProductQuantity);
    }

    //average quantity of all products
    public void avgProductStock() {
        double averageStock = 0.0;
        int totalQuantityOfStock = 0;
        int numberOfProducts = 0;
        for(Product product : productsRepository) {
            totalQuantityOfStock += product.quantity;
            numberOfProducts++;
        }
        averageStock = (double) totalQuantityOfStock / numberOfProducts;
        System.out.println(averageStock);
    }

    //find product by name
    public void findProductByName(String name) throws NameNotFoundException {
        String lowerCaseName = name.toLowerCase();
        boolean found = false;
        for(Product product : productsRepository) {
            String productNameLowerCase = product.name.toLowerCase();
            if(productNameLowerCase.equals(lowerCaseName)) {
                System.out.println("Result: " + product.name + ", Quantity: " + product.quantity);
                found = true;
            }
        }
        if(!found) {
            throw new NameNotFoundException("No such product in stock.");
        }

    }

    public void display() {
        if (productsRepository.isEmpty()) {
            System.out.println("The shop is currently empty.");
        } else {
            System.out.println("Products in the shop:");
            for (Product product : productsRepository) {
                product.display();
            }
        }
    }

}
