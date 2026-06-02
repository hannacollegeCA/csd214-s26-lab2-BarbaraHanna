package bookstore.pojos;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TireTest {
    @Test
    void testEquality() {
        Tire T1 = new Tire("Michelin", 120.0, 17);
        Tire T2 = new Tire("Michelin", 120.0, 17);
        Tire T3 = new Tire("Continental", 250.0, 17);

        assertEquals(T1, T2);
        assertNotEquals(T1, T3);
    }
}