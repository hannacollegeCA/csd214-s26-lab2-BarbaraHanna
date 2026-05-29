package bookstore.pojos;

import java.util.Scanner;

public abstract class SkincareProduct extends Product {

    private String skinType = "Normal";
    private double price = 0.0;

    public SkincareProduct() {
        super();
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void initialize(Scanner input) {
        System.out.println("Enter Skin Type:");
        this.skinType = getInput(input, this.skinType);

        System.out.println("Enter Price:");
        this.price = getInput(input, this.price);
    }

    @Override
    public void edit(Scanner input) {
        System.out.println("Edit Skin Type [" + this.skinType + "]:");
        this.skinType = getInput(input, this.skinType);

        System.out.println("Edit Price [" + this.price + "]:");
        this.price = getInput(input, this.price);
    }

    @Override
    public String toString() {
        return "SkincareProduct{" +
                "skinType='" + skinType + '\'' +
                ", price=" + price +
                "} " + super.toString();
    }
}
