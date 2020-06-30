package menu;

public class Topping {

    private String name;
    private boolean healthy;

    private Topping(String name, boolean healthy) {
        this.name = name;
        this.healthy = healthy;
    }

    public String getName() {
        return name;
    }

    public boolean getHealthy() {
        return healthy;
    }

    public static final Topping Ketchup = new Topping("Ketchup", false);
    public static final Topping Mustard = new Topping("Mustard", false);
    public static final Topping Mayo = new Topping("Mayo", false);
    public static final Topping Cheese = new Topping("Cheese", false);
    public static final Topping Pickles = new Topping("Pickles", true);
    public static final Topping Tomatoes = new Topping("Tomatoes", true);
    public static final Topping Jalapenos = new Topping("Jalapenos", true);
    public static final Topping Bacon = new Topping("Bacon", false);
    public static final Topping Lettuce = new Topping("Lettuce", true);
}