package task_3.mybag;

import task_3.base.ShoppingItem;

import java.util.ArrayList;

public class MyBag {
    ArrayList<ShoppingItem> myItemsBag = new ArrayList<>();

    public void addShoppingItems(ShoppingItem item) {

        myItemsBag.add(item);

    }

    public void showMyBag() {
        int itemsCount = 0;
        double sum = 0;
        for (ShoppingItem x : myItemsBag) {
            x.printItemInfo();

            sum += x.getPrice();
            itemsCount++;


        }
        System.out.println("\nSubtotal" + "(" + itemsCount + " item)" + "....... $" + sum);
        if (itemsCount == 0) {
            System.out.println("Nothing to see here yet!");
        }

    }

    public void deleteItemFromBag(ShoppingItem itemForDelete) {

        myItemsBag.remove(itemForDelete);

    }


}
