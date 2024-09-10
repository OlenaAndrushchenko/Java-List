package dev.olena;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DaysOfWeekTest {
    private DaysOfWeek daysOfWeek;

    @BeforeEach
    void setUp() {
        daysOfWeek = new DaysOfWeek();
    }

    @Test
    void testClearDaysOfWeek() {
        daysOfWeek.clearDaysOfWeek();
        assertEquals(0, daysOfWeek.getNumberOfDays());
    }

    @Test
    void testCreateDaysOfWeek() {
        assertNotNull(daysOfWeek.getDaysOfWeek());
        assertEquals(7, daysOfWeek.getNumberOfDays());
    }

    @Test
    void testDayExists() {
        assertTrue(daysOfWeek.dayExists("Monday"));
    }

    @Test
    void testGetDaysOfWeek() {
        List<String> days = daysOfWeek.getDaysOfWeek();
        assertEquals(7, days.size(), "Should return 7 days");
        assertEquals("Monday", days.get(0));
        assertEquals("Tuesday", days.get(1));
        assertEquals("Wednesday", days.get(2));
        assertEquals("Thursday", days.get(3));
        assertEquals("Friday", days.get(4));
        assertEquals("Saturday", days.get(5));
        assertEquals("Sunday", days.get(6));
    }

    @Test
    void testGetNumberOfDays() {
        assertEquals(7, daysOfWeek.getNumberOfDays());
    }

    @Test
    void testGetRequestedDay() {
        assertEquals("Monday", daysOfWeek.getRequestedDay(0));
        assertEquals("Sunday", daysOfWeek.getRequestedDay(6));
        assertNull(daysOfWeek.getRequestedDay(7));
    }

    @Test
    void testRemoveDay() {
        daysOfWeek.removeDay("Monday");
        assertFalse(daysOfWeek.dayExists("Monday"));
        assertEquals(6, daysOfWeek.getNumberOfDays());
    }

    @Test
    void testSortDaysAlphabetically() {
        daysOfWeek.sortDaysAlphabetically();
        assertEquals("Friday", daysOfWeek.getRequestedDay(0));
    }
}
