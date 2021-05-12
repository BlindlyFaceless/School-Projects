

public class ShoppingCart {
     public static void main(String[] args) 
    {
        GroceryItem pears = new GroceryItem("Pears", 2.50);
        GroceryItem shoes = new GroceryItem("Shoes", 10.25, true);
        GroceryItem headphones = new GroceryItem("HeadPhones", 25.99, true);
        GroceryItem cauliflower = new GroceryItem("Cauliflower", 5.50);
        GroceryItem plywood = new GroceryItem("Plywood", 115.50, true);

        GroceryList cart = new GroceryList();
        cart.addItem(pears); 
        cart.addItem(shoes); 
        cart.addItem(headphones); 
        cart.addItem(cauliflower);
        cart.addItem(plywood);
        System.out.println(cart.printReceipt());
        cart.removeItem("Plywood");
        System.out.println(cart.printReceipt());
         
    }
}
