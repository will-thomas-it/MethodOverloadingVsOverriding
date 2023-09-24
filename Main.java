public class Main {
    public static void main(String[] args) {
        // Create a classic burger object
        Burger classicBurger = new Burger("Classic Burger", 5.99);
        
        // Create a cheeseburger object
        Burger cheeseBurger = new Cheeseburger("Cheeseburger", 6.99);

        // Display information about the classic burgerd
        classicBurger.display();
        System.out.println();
        
        // Display information about the cheeseburger
        cheeseBurger.display();

        // Create a burger overload object
        BurgerOverload burgerOverload = new BurgerOverload();
        
        // Call the serve method with no arguments (method overloading)
        burgerOverload.serve();
        
        // Call the serve method with a topping argument (method overloading)
        burgerOverload.serve("cheese");
    }
}