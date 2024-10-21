import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("Test next day")
    public void findNextDay() {
        NextDay nextDay = new NextDay();
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test end of month")
    public void findEndOfMonth() {
        NextDay nextDay = new NextDay();
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test end of month 2")
    public void findEndOfMonth2() {
        NextDay nextDay = new NextDay();
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test end of February in non-leap year")
    public void findEndOfFebruaryNonLeapYear() {
        NextDay nextDay = new NextDay();
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test end of February in leap year")
    public void findEndOfFebruaryLeapYear() {
        NextDay nextDay = new NextDay();
        int day = 29;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test next year")
    public void findNextYear() {
        NextDay nextDay = new NextDay();
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String result = nextDay.getNextDay(day,month, year);
        assertEquals(expected,result);
    }
}