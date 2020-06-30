package menu;

import java.util.*;

public class Meal {

    private String name;
    private Side side;
    private Burger burger;
    private Drink drink;
    private double price;

    private ArrayList<Side> sideList = new ArrayList<Side>();

    public static final Meal valueMeal = new Meal("Value Meal", Side.fries, Burger.value, Drink.coke, 7.00);
    public static final Meal healthyMeal = new Meal("Healthy Meal", Side.salad, HealthBurger.health, Drink.water,
            12.00);
    public static final Meal deluxeMeal = new Meal("Deluxe Meal", Side.fries, DeluxeBurger.deluxe, Drink.pepsi, 17.00);

    private Meal(String name, Side side, Burger burger, Drink drink, double price) {
        this.name = name;
        this.side = side;
        this.burger = burger;
        this.drink = drink;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Side getSide() {
        return side;
    }

    public Burger getBurger() {
        return burger;
    }

    public Drink getDrink() {
        return drink;
    }

    public double getPrice() {
        return price;
    }

    public void addSide(Side side) {

        try {
            if (sideList.size() < 3) {

                sideList.add(side);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Cannot add more than 3 sides.");
        }
    }

    @Override
    public String toString() {
        String meal = "Meal{" + "name='" + name + '\'' + ", side=" + side.getName() + ", ";

        for (Side s : sideList) {
            meal += s.getName();
            meal += ", ";
        }

        meal += "burger=" + burger + ", drink=" + drink.getName() + ", price=" + price + '}';

        return meal;
    }
}