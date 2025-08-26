public class CalendarDateFall24_2a {
    int day, month, year;

    CalendarDateFall24_2a(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void adjustDay() {
        while (day > 30){
            day -= 30;
            month++;
        }
    }
    public void addDay(int incDay) {
        day += incDay;
        adjustDay();
    }
}
