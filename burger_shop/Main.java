package burger_shop;

import menu.*;

/*

DID PAIR PROGRAMMING WITH:
CALEB WATERS
KEVIN IBANEZ

(Our TA said pair programming was allowed)

*/

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Order o1 = new Order(Meal.healthyMeal);
        o1.addBurger(Burger.value);
        o1.addSides(Side.applePie, Side.cheeseFries, Side.salad, Side.chips);
        System.out.println(o1.purchaseOrder());

        Order o2 = new Order(DeluxeBurger.deluxe, Bread.brioche, Meat.steak);
        o2.addDrink(Drink.orangeFanta);
        o2.addSides(Side.applePie);
        System.out.println(o2.purchaseOrder());
    }
}
