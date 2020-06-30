package menu;

import java.util.*;

public class HealthBurger extends Burger {

    private String name;
    private double price = 11.00;
    private Meat meat;
    private Bread bread;

    private ArrayList<Topping> toppingList = new ArrayList<>();

    public static final HealthBurger health = new HealthBurger("Health Burger", Meat.impossibleMeat, Bread.rye);

    public HealthBurger(String name, Meat meat, Bread bread) {
        super(name, meat, bread);

        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Topping topping) {
        try {
            if (toppingList.size() < 4) {

                try {
                    // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                    if (!checkToppingDuplicate(topping) && checkToppingHealthy(topping)) {
                        toppingList.add(topping);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Cannot add unhealthy or duplicate toppings.");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 4 toppings.");
        }
    }

    private boolean checkToppingDuplicate(Topping top) {

        for (Topping t : toppingList) {

            if (t.equals(top)) {
                return true;
            }
        }

        return false;
    }

    private boolean checkToppingHealthy(Topping top) {

        return top.getHealthy();
    }

    public double totalBurgerPrice() {

        price += toppingList.size() * 0.50;

        return price;
    }

    @Override
    public String toString() {

        String burger;

        burger = "Burger: {name: " + name + ", price: " + price + ", bread: " + bread.getName() + ", meat: "
                + meat.getName() + ", toppings: ";

        for (Topping top : toppingList) {
            if (toppingList.indexOf(top) == toppingList.size() - 1) {
                burger += top.getName();
            } else {
                burger += top.getName();
                burger += ", ";
            }
        }

        burger += "}";

        return burger;
    }
}