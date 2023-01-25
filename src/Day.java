public class Day {

    private int day;

    public Day(int day) {
        this.day = day;
    }

    public String getDay() {
        if (day == 11 || day == 12 || day == 13) {
            return day + "th";
        } else {
            int lastDigit = day % 10;
            String suffix = "";
            switch (lastDigit) {
                case 1:
                    suffix = "st";
                    break;
                case 2:
                    suffix = "nd";
                    break;
                case 3:
                    suffix = "rd";
                    break;
                default:
                    suffix = "th";
                    break;
            }
            return day + suffix;
        }
    }

}
