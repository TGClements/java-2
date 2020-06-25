package burger_shop;

import java.util.*;

public class Drinks {

    private ArrayList<String> drinkList;

    public Drinks() {
        drinkList = new ArrayList<>();

        drinkList.add("Sprite");
        drinkList.add("Coke");
        drinkList.add("Pepsi");
        drinkList.add("Dr. Pepper");
        drinkList.add("Mt. Dew");
        drinkList.add("Orange Fanta");
        drinkList.add("Gatorade");
        drinkList.add("Powerade");
        drinkList.add("Water");
    }

    public String getDrink(int index) {

        return drinkList.get(index);
    }

    public ArrayList<String> getAllDrinks() {

        return drinkList;
    }

}