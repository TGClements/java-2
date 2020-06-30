package menu;

public class Side {

    private String name;
    private double price = 2.00;

    public static final Side fries = new Side("Fries");
    public static final Side chips = new Side("Chips");
    public static final Side applePie = new Side("Apple Pie");
    public static final Side cheeseFries = new Side("Cheese Fries");
    public static final Side salad = new Side("Salad");

    private Side(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}