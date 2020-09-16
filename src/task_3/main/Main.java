package task_3.main;

import task_3.mybag.MyBag;
import task_3.base.ShoppingItem;
import task_3.clothes.BabyClothes;
import task_3.clothes.MenClothing;
import task_3.clothes.WomenClothing;

import static task_3.clothes.ClothingBrands.*;
import static task_3.clothes.ClothingSize.*;


public class Main {
    public static void main(String[] args) {
        ShoppingItem item1 = new WomenClothing(ADIDAS, XL, "blue");
        ShoppingItem item2 = new BabyClothes(REEBOK, L, "red");
        ShoppingItem item3 = new MenClothing(PRADA, XXL, "green");


        MyBag myBag = new MyBag();

        myBag.addShoppingItems(item1);
        myBag.addShoppingItems(item2);
        myBag.addShoppingItems(item3);

        ShoppingItem item4 = new WomenClothing(PRADA, XL, "yellow");
        myBag.addShoppingItems(item4);



        myBag.deleteItemFromBag(item4);
        myBag.showMyBag();
    }
}
