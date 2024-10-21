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
}