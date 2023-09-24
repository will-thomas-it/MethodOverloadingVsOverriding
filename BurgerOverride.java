class BurgerOverride {
    public String name;
    public double price;

    public BurgerOverride(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Burger: " + name);
        System.out.println("Price: $" + price);
    }
}