package task_3.base;

import task_3.clothes.ClothingBrands;

public class ShoppingItem {

    private double price;
    private ClothingBrands brand;

    public ShoppingItem(ClothingBrands brand, double price) {

        this.brand = brand;
        this.price = price;

    }



    public ClothingBrands getBrand() {
        return brand;
    }

    public double getPrice() {
        if (price <= 0) {
            return 0;
        }
        return price;
    }


    public void printItemInfo() {

        System.out.print("Brand: " + brand + "\nPrice: " + price );


    }


}
