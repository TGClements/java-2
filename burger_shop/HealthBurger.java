package burger_shop;

import java.util.*;

public class HealthBurger extends Burger {

    private String name;
    private double price;
    private String breadType;
    private String meatType;
    private ArrayList<String> toppingList;

    private int toppingsCounter = 0;

    public HealthBurger(String name, double price, String bread, String meat) {
        super(name, price, bread, meat);

        this.name = name;
        this.price = price;
        this.breadType = bread;
        this.meatType = meat;

        toppingList = new ArrayList<>();
    }

    public static double burgerPrice() {

        return 11.95;
    }

    public double totalBurgerPrice() {

        price += toppingsCounter * 1.00;

        return price;
    }

    public void addToppings(Toppings t, int index) {

        ArrayList<String> healthyOptions = new ArrayList<>();
        healthyOptions = t.getHealthyToppings();

        try {
            if (toppingsCounter < 4) {
                // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                if (!checkToppingDuplicate(toppingList, healthyOptions.get(index))) {
                    toppingList.add(healthyOptions.get(index));

                    toppingsCounter++;
                } else {
                    System.out.println("Topping already added! Cannot add duplicate.");
                }

            } else {
                System.out.println("Cannot add more than 4 toppings.");
            }
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println("Invalid topping option.\nAvailable options: ");
            for (String s : healthyOptions) {
                System.out.println(s);
            }
        }
    }

    private boolean checkToppingDuplicate(ArrayList<String> list, String item) {

        for (String s : list) {

            if (s.equals(item)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {

        String burger;

        burger = "Burger: {name: " + name + ", price: " + price + ", bread: " + breadType + ", meat: " + meatType
                + ", toppings: ";

        for (String s : toppingList) {
            burger += s;
            burger += ", ";
        }

        burger += "}";

        return burger;
    }
}
