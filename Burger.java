class Burger {
    public String name;
    public double price;

    public Burger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println("Burger: " + name);
        System.out.println("Price: $" + price);
    }
}