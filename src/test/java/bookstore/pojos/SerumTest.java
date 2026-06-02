package bookstore.pojos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerumTest {
    @Test
    void testEquality() {
        Serum sk1 = new Serum();
        sk1.setSkinType("Dry");
        sk1.setPrice(100);

        Serum sk2 = new Serum();
        sk2.setSkinType("Dry");
        sk2.setPrice(100);

        Serum sk3 = new Serum();
        sk3.setSkinType("Oily");
        sk3.setPrice(70);

        assertEquals(sk1, sk2);
        assertNotEquals(sk1, sk3);
    }

    @Test
    void testDefaultConstructor() {
        Serum serum = new Serum();

        assertEquals("Normal", serum.getSkinType());
        assertEquals(0.0, serum.getPrice());
        assertEquals("Hyaluronic Acid", serum.getActiveIngredient());

    }
    @Test
    void testSellItemDecrementsStock() {
        Serum serum = new Serum();
        serum.setCopies(5);

        serum.sellItem();

        assertEquals(4, serum.getCopies());
    }
}
