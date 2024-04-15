import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> productsRepository;

    public Shop() {
        this.productsRepository = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productsRepository.add(product);
    }

    //count all food product
    public int countFoodProduct() throws EmptyListException {
        int foodProductQuantity = 0;
        for(Product foodProduct : productsRepository) {
            if(foodProduct instanceof FoodProduct) {
                foodProductQuantity++;
            }
        }
        if(foodProductQuantity == 0) {
            throw new EmptyListException("The Food product list is empty.");
        }
        return foodProductQuantity;
    }

    //count all electronic product
    public int countElectronicProduct() throws EmptyListException {
        int electronicProductQuantity = 0;
        for(Product electronicProduct : productsRepository) {
            if(electronicProduct instanceof ElectronicProduct) {
                electronicProductQuantity++;
            }
        }
        if(electronicProductQuantity == 0) {
            throw new EmptyListException("The Electronic product list is empty.");
        }
        return electronicProductQuantity;
    }

    //average quantity of all products
    public double avgProductStock() throws EmptyListException {
        double averageStock = 0.0;
        double totalQuantityOfStock = 0.0;
        int numberOfProducts = 0;
        for(Product product : productsRepository) {
            totalQuantityOfStock += product.quantity;
            numberOfProducts++;
        }
        if(numberOfProducts == 0) {
            throw new EmptyListException("The Product list is empty.");
        }
        averageStock = totalQuantityOfStock / numberOfProducts;
        return averageStock;
    }

    //find product by name
    public Product findProductByName(String name) throws NameNotFoundException {
        String lowerCaseName = name.toLowerCase();
        for(Product product : productsRepository) {
            String productNameLowerCase = product.name.toLowerCase();
            if(productNameLowerCase.equals(lowerCaseName)) {
                return product;
            }
        }
        throw new NameNotFoundException("No such product in stock.");
    }

    //products above stock level
    public ArrayList<Product> findProductsAboveStockLevel(int quantity) throws EmptyListException {
        ArrayList<Product> listToStoring = new ArrayList<>();
        for(Product product : productsRepository) {
            if(product.quantity > quantity) {
                listToStoring.add(product);
            }
        }
        if(listToStoring.isEmpty()) {
            throw new EmptyListException("The Product list is empty.");
        }
        return listToStoring;
    }

    //electronic products above stock level
    public ArrayList<Product> findElectronicProductsAboveWarrianty(int warranty) throws EmptyListException{
        ArrayList<Product> listToStoring = new ArrayList<>();
        for(Product product : productsRepository) {
            if(product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                    if(electronicProduct.warranty > warranty) {
                        listToStoring.add(electronicProduct);
                    }
            }
        }
        if(listToStoring.isEmpty()) {
            throw new EmptyListException("The Product list is empty.");
        }
        return listToStoring;
    }

    //average electronic product
    public double avgElectronicProductQuantity() throws EmptyListException{
        double averageStock = 0.0;
        double totalQuantityOfStock = 0;
        int numberOfProducts = 0;
        for(Product product : productsRepository) {
            if(product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                totalQuantityOfStock += electronicProduct.quantity;
                numberOfProducts++;
            }
        }
        if(numberOfProducts == 0) {
            throw new EmptyListException("The Product list is empty.");
        }
        averageStock = totalQuantityOfStock / numberOfProducts;
        return averageStock;
    }

    //all electronic product
    public ArrayList<Product> findAllElectronicProduct() throws EmptyListException{
        ArrayList<Product> listToStoring = new ArrayList<>();
        for(Product product : productsRepository) {
            if(product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                listToStoring.add(electronicProduct);
            }
        }
        if(listToStoring.isEmpty()) {
            throw new EmptyListException("The Product list is empty.");
        }
        return listToStoring;
    }

    //find minimum quantity all product
    public ArrayList<Product> minQuantityProduct() throws EmptyListException{
        ArrayList<Product> listToStoring = new ArrayList<>();
        int minQuantity = Integer.MAX_VALUE;
        for(Product product : productsRepository) {
            if(product.quantity < minQuantity) {
                minQuantity = product.quantity;
            }
        }
        for(Product product : productsRepository) {
            if(product.quantity == minQuantity) {
                listToStoring.add(product);
            }
        }
        if(listToStoring.isEmpty()) {
            throw new EmptyListException("The Product list is empty.");
        }
        return listToStoring;
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
