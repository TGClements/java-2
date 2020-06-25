package burger_shop;

import java.util.ArrayList;

public class Burger {

    private String name;
    private double price;
    private String breadType;
    private String meatType;
    private ArrayList<String> toppingList;

    private int toppingsCounter = 0;

    public Burger(String name, double price, String bread, String meat) {

        this.name = name;
        this.price = price;
        this.breadType = bread;
        this.meatType = meat;

        toppingList = new ArrayList<>();
    }

    public Burger() {
    }

    public static double burgerPrice() {

        return 10.95;
    }

    public double totalBurgerPrice() {

        price += toppingsCounter * 0.50;

        return price;
    }

    public void addToppings(Toppings t, int index) {

        try {
            if (toppingsCounter < 2) {

                // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                if (!checkToppingDuplicate(toppingList, t.getTopping(index))) {
                    toppingList.add(t.getTopping(index));
                    toppingsCounter++;
                } else {
                    System.out.println("Topping already added! Cannot add duplicate.");
                }

            } else {
                System.out.println("Cannot add more than 2 toppings.");
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
