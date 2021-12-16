package encapsulation.example3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocketTest {

    public static final double HUNDRED_DOLLARS = 100.0;
    public static final double FIFTYY_DOLLARS = 50.0;

    @Test
    void testShowMoney() {
        Pocket pocket = new Pocket(HUNDRED_DOLLARS);

        double currentMoney = pocket.showMoney();

        assertEquals(HUNDRED_DOLLARS, currentMoney);
    }

    @Test
    void testAddMoney() {
        Pocket pocket = new Pocket(HUNDRED_DOLLARS);

        pocket.addMoney(FIFTYY_DOLLARS);

        double actualMoneyInPocket = pocket.showMoney();

        assertEquals(150.0, actualMoneyInPocket);

    }

    @Test
    void takeOutMoney() {
        Pocket pocket = new Pocket(FIFTYY_DOLLARS);
        pocket.takeOutMoney(20.0);
        assertEquals(30.0, pocket.showMoney());
    }
}