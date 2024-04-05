public class StockManagement {
    public static void main(String[] args) {

        Shop shop = new Shop();

        FoodProduct milk = new FoodProduct("milk", 10, "2024.07.05");
        FoodProduct cheese = new FoodProduct("Trappist", 5, "2024.08.09");
        FoodProduct bread = new FoodProduct("White Bread", 20, "2024.06.18");
        shop.addProduct(milk);
        shop.addProduct(cheese);
        shop.addProduct(bread);

        ElectronicProduct asusLaptop = new ElectronicProduct("Asus TUF 505DT", 3, 2);
        ElectronicProduct samsungTv = new ElectronicProduct("Samsung 4K QLED", 5, 3);
        shop.addProduct(asusLaptop);
        shop.addProduct(samsungTv);

        //shop.countFoodProduct();
        //shop.countElectronicProduct();
        //shop.avgProductStock();

        try {
            shop.findProductByName("trappist");
        } catch(NameNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //shop.display();

        /*
        FoodProduct milk = new FoodProduct("Not to milk", 10, "2024.07.05");
        FoodProduct gorgonzola = new FoodProduct("Gorgonzola", 20, "2024.06.05");
        ElectronicProduct asusLaptop = new ElectronicProduct("Asus TUF 505DT", 3, 2);
        ElectronicProduct samsungTv = new ElectronicProduct("Samsung 4K QLED", 5, 3);
        //add and sell
        milk.addStock(0);//done
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