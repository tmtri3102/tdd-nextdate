public class NextDay {
    public  String getNextDay(int day, int month, int year) {
        int[] daysInMonth = { 31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        day++;
        // Neu 32 > 31 thang 3 ==> 1 thang 4
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;

            // Neu thang 12++ = 13 => 1 thang 1
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        String slash = "/";
        String result = day + slash + month + slash + year;
        return result;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
