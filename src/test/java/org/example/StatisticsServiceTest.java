package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxIfAllOfIncomesAreTheSame() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {17, 18, 12, 14, 15, 16, 14, 6, 9, 4, 5};
        long expected = 18;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}