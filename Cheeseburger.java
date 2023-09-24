class Cheeseburger extends Burger {
    public Cheeseburger(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.println("Cheeseburger: " + super.name);
        System.out.println("Price: $" + super.price);
    }
}