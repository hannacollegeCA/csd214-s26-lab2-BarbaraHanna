package bookstore.pojos;

import java.util.Scanner;

public class Serum extends SkincareProduct {

    private String activeIngredient = "Hyaluronic Acid";

    public Serum() {
        super();
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    @Override
    public void initialize(Scanner input) {
        super.initialize(input);

        System.out.println("Enter Active Ingredient:");
        this.activeIngredient = getInput(input, this.activeIngredient);
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);

        System.out.println("Edit Active Ingredient [" + this.activeIngredient + "]:");
        this.activeIngredient = getInput(input, this.activeIngredient);
    }

    @Override
    public void sellItem() {
        System.out.println("Selling Serum with ingredient: " + activeIngredient);
    }

    @Override
    public String toString() {
        return "Serum{" +
                "activeIngredient='" + activeIngredient + '\'' +
                "} " + super.toString();
    }
}
