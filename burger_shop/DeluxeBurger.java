package burger_shop;

import java.util.*;

public class DeluxeBurger extends Burger {

    private String name;
    private double price;
    private String breadType;
    private String meatType;
    private ArrayList<String> toppingList;

    private int toppingsCounter = 0;

    public DeluxeBurger(String name, double price, String bread, String meat) {
        super(name, price, bread, meat);

        this.name = name;
        this.price = price;
        this.breadType = bread;
        this.meatType = meat;

        toppingList = new ArrayList<>();
    }

    public static double burgerPrice() {

        return 15.95;
    }

    public double totalBurgerPrice() {

        price += toppingsCounter * 1.00;

        return price;
    }

    public void addToppings(Toppings t, int index) {

        try {
            if (toppingsCounter < 6) {
                // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                if (!checkToppingDuplicate(toppingList, t.getTopping(index))) {
                    toppingList.add(t.getTopping(index));

                    toppingsCounter++;
                } else {
                    System.out.println("Topping already added! Cannot add duplicate.");
                }
            } else {
                System.out.println("Cannot add more than 6 toppings.");
            }
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println("Invalid topping option. Available toppings: ");
            for (String s : t.getAllToppings()) {
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
