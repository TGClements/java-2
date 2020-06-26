package burger_shop;

import menu.*;

import java.util.ArrayList;

public class Order {
    private Burger burger;
    private Bread bread;
    private Meat meat;
    private Meal meal;

    ArrayList<Topping> toppingList = new ArrayList<>();
    ArrayList<Side> sideList = new ArrayList<>();
    ArrayList<Burger> burgerList = new ArrayList<>();
    ArrayList<Drink> drinkList = new ArrayList<>();
    ArrayList<Meal> mealList = new ArrayList<>();

    public Order(Burger burger, Bread bread, Meat meat) {
        this.burger = burger;
        this.bread = bread;
        this.meat = meat;
    }

    public Order(Meal meal) {
        this.meal = meal;
    }

    public void addToppings(Topping one, Topping two, Topping three, Topping four) {
        toppingList.add(one);
        toppingList.add(two);
        toppingList.add(three);
        toppingList.add(four);
    }

    public void addToppings(Topping one, Topping two, Topping three) {
        toppingList.add(one);
        toppingList.add(two);
        toppingList.add(three);
    }

    public void addToppings(Topping one, Topping two) {
        toppingList.add(one);
        toppingList.add(two);
    }

    public void addToppings(Topping one) {
        toppingList.add(one);
    }

    public void addSides(Side one, Side two, Side three, Side four) {
        sideList.add(one);
        sideList.add(two);
        sideList.add(three);
        sideList.add(four);
    }

    public void addSides(Side one, Side two, Side three) {
        sideList.add(one);
        sideList.add(two);
        sideList.add(three);
    }

    public void addSides(Side one, Side two) {
        sideList.add(one);
        sideList.add(two);
    }

    public void addSides(Side one) {
        sideList.add(one);
    }

    public void addBurger(Burger burgie) {
        burgerList.add(burgie);
    }

    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    public void addMeal(Meal meal) {
        mealList.add(meal);
    }

    public double purchaseOrder() {
        double ordertotal = 0;

        try {
            ordertotal += meal.getPrice();
        } catch (NullPointerException npe) {
            // Ignore
        }

        try {
            ordertotal += burger.totalBurgerPrice();
        } catch (NullPointerException npe) {
            // Ignore
        }

        for (Burger b : burgerList) {
            ordertotal += b.totalBurgerPrice();
        }

        for (Topping t : toppingList) {
            ordertotal += 0.50;
        }

        for (Side s : sideList) {
            ordertotal += 1.00;
        }

        for (Drink d : drinkList) {
            ordertotal += 0.25;
        }

        for (Meal m : mealList) {
            ordertotal += m.getPrice();
        }

        return ordertotal;
    }
}