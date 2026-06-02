package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MoisturizerTest {
    @Test
    void testEquality() {
        Moisturizer sk1 = new Moisturizer();
        sk1.setSkinType("Dry");
        sk1.setPrice(50);
        sk1.setOilFree(true);

        Moisturizer sk2 = new Moisturizer();
        sk2.setSkinType("Dry");
        sk2.setPrice(50);
        sk2.setOilFree(true);

        Moisturizer sk3 = new Moisturizer();
        sk3.setSkinType("Oily");
        sk3.setPrice(80);
        sk3.setOilFree(false);

        assertEquals(sk1, sk2);
        assertNotEquals(sk1, sk3);
    }
}
