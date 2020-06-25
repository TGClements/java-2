package burger_shop;

/*

DID PAIR PROGRAMMING WITH:
CALEB WATERS
KEVIN IBANEZ

(Our TA said pair programming was allowed)

*/

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        // Toppings t = new Toppings();
        // Bread br = new Bread();
        // Meat m = new Meat();

        // Burger b = new Burger("Basic", Burger.plainBurgerPrice(), br.getBread(4), m.getMeat(3));
        // b.addToppings(t, 0);
        // b.addToppings(t, 0);

        // System.out.println(b.toString());
        // System.out.println(b.totalBurgerPrice());

        // HealthBurger hb = new HealthBurger("Basic", 10.50, br.getBread(4), m.getMeat(3));
        // hb.addToppings(t, 0);
        // hb.addToppings(t, 0);

        // System.out.println(hb.toString());

        // DeluxeBurger db = new DeluxeBurger("Basic", 10.50, br.getBread(4), m.getMeat(3));
        // db.addToppings(t, 0);
        // db.addToppings(t, 15);
        // db.addToppings(t, 0);
        // db.addToppings(t, 2);
        // db.addToppings(t, 3);
        // db.addToppings(t, 4);
        // db.addToppings(t, 5);
        // db.addToppings(t, 6);
        // System.out.println(db.toString());

        Meal m1 = new Meal();
        m1.newHealthyMeal();
        m1.addTopping(1);
        m1.changeDrink(0);
        System.out.println(m1.getCurrentMeal());

        Order o1 = new Order(m1);
        o1.purchaseOrder();
    }
}
