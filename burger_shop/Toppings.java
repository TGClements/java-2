package burger_shop;

import java.util.*;

public class Toppings {

    private ArrayList<String> toppingList;

    public Toppings() {
        toppingList = new ArrayList<>();

        toppingList.add("Ketchup");
        toppingList.add("Mustard");
        toppingList.add("Mayonnaise");
        toppingList.add("Cheese");
        toppingList.add("Pickles");
        toppingList.add("Lettuce");
        toppingList.add("Onions");
        toppingList.add("Tomatoes");
        toppingList.add("Jalapenos");
        toppingList.add("Bacon");
    }

    public String getTopping(int index) {

        return toppingList.get(index);
    }

    public ArrayList<String> getAllToppings() {

        return toppingList;
    }

    public ArrayList<String> getUnhealthyToppings() {
        ArrayList<String> unHealthyToppingList = new ArrayList<>();

        for (String s : toppingList) {
            if (s.equals("Ketchup") || s.equals("Mustard") || s.equals("Mayonnaise") || s.equals("Cheese")
                    || s.equals("Bacon")) {
                unHealthyToppingList.add(s);
            }
        }

        return unHealthyToppingList;
    }

    public ArrayList<String> getHealthyToppings() {

        ArrayList<String> healthyToppingList = new ArrayList<>();

        for (String s : toppingList) {
            if (s.equals("Pickles") || s.equals("Lettuce") || s.equals("Onions") || s.equals("Tomatoes")
                    || s.equals("Jalapenos")) {
                healthyToppingList.add(s);
            }
        }

        return healthyToppingList;
    }
}