public class Year {
    private int year;

    private String[] yearNames = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger",
            "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

    public Year(int yearIndex) {
        this.year = yearIndex;
    }
    public String getYearName() {
        return yearNames[year % 12];
    }

}
