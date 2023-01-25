public class Season {
    private int monthIndex;
    private SeasonName season;
    public Season(int monthIndex) {
        this.monthIndex = monthIndex;
        initSeason();
    }

    private void initSeason() {
        switch (monthIndex) {
            case 1:
            case 2:
            case 12:
                season = SeasonName.WINTER;
                break;
            case 3:
            case 4:
            case 5:
                season = SeasonName.SPRING;
                break;
            case 6:
            case 7:
            case 8:
                season = SeasonName.SUMMER;
                break;
            case 9:
            case 10:
            case 11:
                season = SeasonName.AUTUMN;
                break;
        }
    }

    public String getSeason() {
        String seasonName = "Winter";
        switch (season) {
            case SPRING:
                seasonName = "Spring";
                break;
            case SUMMER:
                seasonName = "Summer";
                break;
            case AUTUMN:
                seasonName = "Autumn";
                break;
            case WINTER:
                seasonName = "Winter";
                break;
        }
        return seasonName;
    }
}
