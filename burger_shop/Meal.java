package burger_shop;

import java.util.ArrayList;

public class Meal {
    Toppings t;
    Bread br;
    Meat m;
    Sides s;
    Drinks d;

    Burger b;

    ArrayList<String> sideList;
    int sideCounter = 1;

    String drink = "";

    public Meal() {
        t = new Toppings();
        br = new Bread();
        m = new Meat();
        s = new Sides();
        d = new Drinks();
        b = new Burger();
        sideList = new ArrayList<>();
    }

    public void newBasicMeal() {
        b = new Burger("name", Burger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sideList.add(s.getSide(0));
        drink = "Coke";
    }

    public void newHealthyMeal() {
        b = new HealthBurger("name", HealthBurger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sideList.add(s.getSide(4));
        drink = "Water";
    }

    public void newDeluxeMeal() {
        b = new DeluxeBurger("name", DeluxeBurger.burgerPrice(), br.getBread(0), m.getMeat(0));
        sideList.add(s.getSide(0));
        drink = "Coke";
    }

    public void addTopping(int index) {
        b.addToppings(t, index);
    }

    public void addSide(int index) {

        try {
            if (sideCounter <= 3) {
                sideList.add(s.getSide(index));
            }
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println("Invalid side option. Available sides: ");
            for (String str : s.getAllSides()) {
                System.out.println(str);
            }
        }
    }

    public void changeDrink(int index) {
        drink = d.getDrink(index);
    }

    public String getCurrentMeal() {

        String currentMeal = b.toString() + " | Sides: {";

        for (String str : sideList) {
            currentMeal += str;
            currentMeal += ", ";
        }
        currentMeal += "} | Drink: " + drink;

        return currentMeal;
    }

    public double totalMealPrice() {

        return b.totalBurgerPrice();
    }
}
