import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> productsRepository;

    ArrayList<Product> listToStoring = new ArrayList<>();
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

    //products above stock level
    public void findProductsAboveStockLevel(int quantity) {
        int productCounter = 0;
        for(Product product : productsRepository) {
            if(product.quantity > quantity) {
                listToStoring.add(product);
                productCounter++;
            }
        }
        if(listToStoring.isEmpty()){
            System.out.println("No such product in stock.");
        }else {
            System.out.println("all products above stock level: " + productCounter);
            for(Product product : listToStoring){
                System.out.println("Name: " + product.name + ", quantity: " + product.quantity);
            }
        }
    }

    //electronic products above stock level
    public void findElectronicProductsAboveWarrianty(int warranty) {
        int productCounter = 0;
        for(Product product : productsRepository) {
            if(product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                    if(electronicProduct.warranty > warranty) {
                        listToStoring.add(electronicProduct);
                        productCounter++;
                    }
            }
        }
        if(listToStoring.isEmpty()) {
            System.out.println("No such product in stock.");
        }else{
            System.out.println("all electronic products above stock level: " + productCounter);
            for(Product product : listToStoring) {
                System.out.println("Name: " + product.name + ", quantity: " + product.quantity);
            }
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
