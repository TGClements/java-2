package burger_shop;

import java.util.ArrayList;

public class Order {

    private Toppings t = new Toppings();
    private Sides sides = new Sides();
    private Drinks drinks = new Drinks();

    private Burger burger;
    private Bread bread;
    private Meat meat;

    private Meal meal;

    private ArrayList<Meal> mealList = new ArrayList<>();
    private ArrayList<Burger> burgerList = new ArrayList<>();
    private ArrayList<String> sidesList = new ArrayList<>();
    private ArrayList<String> drinksList = new ArrayList<>();

    public Order(Burger burger) {
        this.burger = burger;

        burgerList.add(burger);
    }

    public Order(Meal meal) {
        this.meal = meal;

        mealList.add(meal);
    }

    // Add meal toppings
    public void addToppings(Meal meal, int index) {
        meal.addTopping(index);
    }

    // Add burger toppings
    public void addToppings(Burger burger, int index) {
        burger.addToppings(t, index);
    }

    public void addBurger(String burgerType) {

        switch (burgerType) {

            case "Deluxe Burger":
                burgerList.add(
                        new DeluxeBurger("Deluxe Burger", Burger.burgerPrice(), bread.getBread(0), meat.getMeat(0)));
                break;
            case "Health Burger":
                burgerList.add(
                        new HealthBurger("Health Burger", Burger.burgerPrice(), bread.getBread(0), meat.getMeat(0)));
                break;
            default:
                burgerList.add(new Burger("Basic Burger", Burger.burgerPrice(), bread.getBread(0), meat.getMeat(0)));
                break;
        }
    }

    public void addSides(int index) {
        sidesList.add(sides.getSide(index));
    }

    public void addDrink(int index) {
        drinksList.add(drinks.getDrink(index));
    }

    public double purchaseOrder() {
        double total = 0.00;

        for (Burger b : burgerList) {
            total += b.totalBurgerPrice();
        }

        for (Meal m : mealList) {
            total += m.totalMealPrice();
        }

        System.out.println("The total is: " + total);

        return total;
    }
}
