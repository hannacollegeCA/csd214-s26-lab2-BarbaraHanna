package bookstore.pojos;

import java.util.Scanner;

public class Moisturizer extends SkincareProduct {

    private boolean oilFree = false;

    public Moisturizer() {
        super();
    }

    public boolean isOilFree() {
        return oilFree;
    }

    public void setOilFree(boolean oilFree) {
        this.oilFree = oilFree;
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
        System.out.println("Selling Moisturizer (oil-free: " + oilFree + ")");
    }

    @Override
    public String toString() {
        return "Moisturizer{" +
                "oilFree=" + oilFree +
                "} " + super.toString();
    }
}
