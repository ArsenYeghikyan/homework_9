package task_3.clothes;

import task_3.base.ShoppingItem;

public class Clothing extends ShoppingItem {
    ClothingSize size;
    String color;

    public Clothing(ClothingBrands brand, double price, ClothingSize size, String color) {
        super(brand, price);
        this.size = size;
        this.color = color;
    }

    @Override
    public void printItemInfo() {
        super.printItemInfo();
        System.out.println("\nSize: " + size + "\nColor: " + color);
    }


}
