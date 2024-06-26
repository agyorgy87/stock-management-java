public abstract class Product {

    private static int nextId = 1;

    protected String name;

    protected int quantity;

    protected int id;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity  = quantity;
        this.id = nextId;
        nextId++;
    }

    public void addStock(int addQuantity) {
        if(addQuantity > 0) {
            this.quantity += addQuantity;
            System.out.println("successful add.");
        }else if(addQuantity == 0) {
            System.out.println("enter the quantity what you want to add to the product.");
        }else{
            System.out.println("you can't add negative quantity.");
        }
    }

    public void sellStock(int sellQuantity)  {
        if(sellQuantity == 0) {
            System.out.println("enter the quantity what you want to add to the product.");
        }else if(sellQuantity < 0) {
            System.out.println("you can't add negative quantity.");
        }else if(sellQuantity <= quantity) {
            this.quantity -= sellQuantity;
            System.out.println("successful sell.");
        }else{
            System.out.println(sellQuantity + " quantity out of stock, unsuccessful sell.");
        }
    }

    //abstract problem
    public void display() {
        System.out.println("id: " + id + ", product name: " + name + ", quantity: " + quantity);
    }

}