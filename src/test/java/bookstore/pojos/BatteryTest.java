package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BatteryTest {
    @Test
    void testEquality() {
        Battery b1 = new Battery("MotoMaster", 200.00, 600);
        Battery b2 = new Battery("Odyssey", 400.00, 800);
        Battery b3 = new Battery("MotoMaster", 200.00, 600);

        assertEquals(b1, b3);
        assertNotEquals(b1, b2);

    }

    @Test
    void testDefaultConstructor() {
        Battery battery = new Battery("Unknown", 0.0, 0);

        assertEquals("Unknown",  battery.getManufacturer());
        assertEquals(0.0, battery.getPrice());
        assertEquals(0, battery.getColdCrankingAmps());
    }
}
