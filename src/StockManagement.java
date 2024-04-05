public class StockManagement {
    public static void main(String[] args) {

        FoodProduct milk = new FoodProduct("Not to milk", 10, "2024.07.05.");
        FoodProduct gorgonzola = new FoodProduct("Gorgonzola", 20, "2024.06.05.");

        ElectronicProduct asusLaptop = new ElectronicProduct("Asus TUF 505DT", 3, 2);
        ElectronicProduct samsungTv = new ElectronicProduct("Samsung 4K QLED", 5, 3);

        //only display
        /*
        milk.display();
        gorgonzola.display();

        asusLaptop.display();
        samsungTv.display();
        */
        //add and sell

        milk.addStock(0);//done
        milk.display();

        gorgonzola.sellStock(21);
        gorgonzola.display();

        asusLaptop.addStock(1);
        asusLaptop.display();

        samsungTv.sellStock(2);
        samsungTv.display();

    }
}