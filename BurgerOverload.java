class BurgerOverload {

    void serve() {
        System.out.println("Serving a burger.");
    }

    // Method with a topping argument (overloaded version)
    void serve(String topping) {
        System.out.println("Serving a burger with " + topping + ".");
    }
}