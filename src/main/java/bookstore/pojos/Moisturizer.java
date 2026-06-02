package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Moisturizer extends SkincareProduct {

    private boolean oilFree = false;
    private int copies;

    public Moisturizer() {
        super();
        this.copies = 0;
    }

    public boolean isOilFree() {
        return oilFree;
    }

    public void setOilFree(boolean oilFree) {
        this.oilFree = oilFree;
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

        System.out.println("Is it oil-free? (true/false):");
        this.oilFree = getInput(input, this.oilFree);
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);

        System.out.println("Edit Oil-Free [" + this.oilFree + "]:");
        this.oilFree = getInput(input, this.oilFree);
    }

    @Override
    public void sellItem() {
        if (copies > 0) {
            copies--;
        }
        System.out.println("Selling Moisturizer (oil-free: " + oilFree + ")");
    }

    @Override
    public String toString() {
        return "Moisturizer{" +
                "oilFree=" + oilFree +
                ", copies=" + copies +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moisturizer that = (Moisturizer) o;
        return isOilFree() == that.isOilFree();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isOilFree());
    }
}
