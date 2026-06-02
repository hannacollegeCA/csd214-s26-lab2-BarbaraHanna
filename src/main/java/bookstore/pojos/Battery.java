package bookstore.pojos;

import java.util.Objects;
import java.util.Scanner;

public class Battery extends VehiclePart{
    private int coldCrankingAmps;
    private int copies;

    public Battery() {
        super("Unknown", 0.0);
        this.coldCrankingAmps = 0;
        this.copies = 0;
    }

    public Battery(int coldCrankingAmps) {
        super("Unknown", 0.0);
        this.coldCrankingAmps = coldCrankingAmps;
        this.copies = 0;
    }

    public Battery(String manufacturer, double price, int coldCrankingAmps) {
        super(manufacturer, price);
        this.coldCrankingAmps = coldCrankingAmps;
        this.copies = 0;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "coldCrankingAmps=" + coldCrankingAmps +
                ", copies=" + copies +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Battery battery = (Battery) o;
        return coldCrankingAmps == battery.coldCrankingAmps;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coldCrankingAmps);
    }

    public int getColdCrankingAmps() {
        return coldCrankingAmps;
    }

    public int getCopies() {
        return copies; }

    public void setColdCrankingAmps(int coldCrankingAmps) {
        this.coldCrankingAmps = coldCrankingAmps;
    }

    public void setCopies(int copies) {
        this.copies = copies; }

    @Override
    public void initialize(Scanner input) {
        // Pass scanner up to parent
        super.initialize(input);
        System.out.println("Enter Cold Cranking Amps:");
        this.coldCrankingAmps = getInput(input, 0);
    }

    @Override
    public void edit(Scanner input) {
        super.edit(input);
        System.out.println("Enter Cold Cranking Amps:");
        this.coldCrankingAmps = getInput(input, getColdCrankingAmps());
    }

    @Override
    public void sellItem() {
        if (copies > 0) {
            copies--;
        }
        System.out.println("Selling a Battery");
    }

}

