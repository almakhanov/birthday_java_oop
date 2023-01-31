public class Birthday {
    private int day;
    private int month;
    private int year;

    public Birthday(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String getMonthName() {
        Month monthObject = new Month(month);
        return monthObject.getMonthName();
    }

    private String getBornDateText() {
        return "You was born in " + getDayText() + " of " + getMonthName() + " in " + year;
    }

    private String getSeasonText() {
        Season season = new Season(month);
        return "Season is " + season.getSeason();
    }

    private String getYearNameText() {
        Year yearObject = new Year(year);
        return "Year of " + yearObject.getYearName();
    }

    private String getHoroscopeText() {
        Horoscope horoscope = new Horoscope(day, month);
        return "Horoscope is " + horoscope.getHoroscopeName();
    }

    private String getDayText() {
        Day dayObject = new Day(day);
        return dayObject.getDay();
    }

    public String getBirthdayData() {
        String answer = getBornDateText() +
                "\n" + getSeasonText() +
                "\n" + getYearNameText() +
                "\n" + getHoroscopeText();
        return answer;
    }
}
