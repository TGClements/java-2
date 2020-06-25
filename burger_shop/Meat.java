package burger_shop;

import java.util.ArrayList;

public class Meat {
    private ArrayList<String> meatTypes;

    public Meat() {
        meatTypes = new ArrayList<>();

        meatTypes.add("Ground Beef");
        meatTypes.add("Steak");
        meatTypes.add("Black Bean");
        meatTypes.add("Impossible Meat");
        meatTypes.add("Turkey");
        meatTypes.add("Chicken");
    }

    public String getMeat(int index) {

        return meatTypes.get(index);
    }

    public ArrayList<String> getAllMeats() {

        return meatTypes;
    }
}
