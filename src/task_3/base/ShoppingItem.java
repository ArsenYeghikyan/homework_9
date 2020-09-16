package task_3.base;

import task_3.clothes.ClothingBrands;

public class ShoppingItem {

    private double price;
    private ClothingBrands brand;

    public ShoppingItem(ClothingBrands brand) {

        this.brand = brand;
        this.price = getPrice();

    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public ClothingBrands getBrand() {
        return brand;
    }

    public double getPrice() {

        return price;
    }


    public void printItemInfo() {

        System.out.print("Brand: " + brand + "\nPrice: " + price );


    }


}
