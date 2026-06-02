package bookstore.pojos;

import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Serum serum = (Serum) o;
        return Objects.equals(getActiveIngredient(), serum.getActiveIngredient());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getActiveIngredient());
    }
}
