package menu;

import java.util.ArrayList;

public class Burger {

    private String name;
    private double price = 6.00;
    private Meat meat;
    private Bread bread;

    private ArrayList<Topping> toppingList = new ArrayList<>();

    public static final Burger value = new Burger("Value Burger", Meat.groundBeef, Bread.white);

    public Burger(String name, Meat meat, Bread bread) {

        this.name = name;
        this.meat = meat;
        this.bread = bread;
    }

    public void addTopping(Topping topping) {

        try {
            if (toppingList.size() < 2) {

                try {
                    // Check for a topping duplicate - if there is a duplicate, don't add the requested topping
                    if (!checkToppingDuplicate(topping)) {
                        toppingList.add(topping);
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Topping already added! Cannot add duplicate.");
                }
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 2 toppings.");
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