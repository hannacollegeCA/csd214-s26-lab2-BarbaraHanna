package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Serum extends SkincareProduct {

    private String activeIngredient = "Hyaluronic Acid";
    private int copies;

    public Serum() {
        super();
        this.copies = 0;
    }

    public String getActiveIngredient() {
        return activeIngredient;
    }

    public void setActiveIngredient(String activeIngredient) {
        this.activeIngredient = activeIngredient;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
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
        if (copies > 0) {
            copies--;
        }
        System.out.println("Selling Serum with ingredient: " + activeIngredient);
    }

    @Override
    public String toString() {
        return "Serum{" +
                "activeIngredient='" + activeIngredient + '\'' +
                ", copies=" + copies +
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
