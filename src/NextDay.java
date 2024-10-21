public class NextDay {
    public  String getNextDay(int day, int month, int year) {
        String slash = "/";
        String result = (day+1) + slash + month + slash + year;
        return result;
    }
}
