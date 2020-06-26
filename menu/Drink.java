package menu;

public class Drink {

    private String name;

    public static final Drink sprite = new Drink("Sprite");
    public static final Drink coke = new Drink("Coke");
    public static final Drink pepsi = new Drink("Pepsi");
    public static final Drink drPepper = new Drink("Dr. Pepper");
    public static final Drink mtDew = new Drink("Mt. Dew");
    public static final Drink orangeFanta = new Drink("Orange Fanta");
    public static final Drink gatorade = new Drink("Gatorade");
    public static final Drink powerade = new Drink("Powerade");
    public static final Drink water = new Drink("Water");

    private Drink(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}