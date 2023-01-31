import java.util.Locale;

public class Month {

    private MonthName monthName;

    public Month(int month) {
        this.monthName = MonthName.values()[month];
    }
    // MonthName.values()
    // [MonthName.JANUARY, MonthName.FEBRUARY, ... .....]

    public String getMonthName() {
        return monthName.name();
    }

    public String getMonthNameCorrect() {
        String month = "";
        switch (monthName) {
            case JANUARY:
                month = "January";
                break;
            case FEBRUARY:
                month = "February";
                break;
            case MARCH:
                break;
            case APRIL:
                break;
            case MAY:
                break;
            case JUNE:
                break;
            case JULY:
                break;
            case AUGUST:
                break;
            case SEPTEMBER:
                break;
            case OCTOBER:
                break;
            case NOVEMBER:
                break;
            case DECEMBER:
                break;
        }
        return month;
    }

}