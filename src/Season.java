public class Season {
    private int monthIndex;
    public Season(int monthIndex) {
        this.monthIndex = monthIndex;
    }

    public String getSeason() {
        String seasonName = "Winter";
        switch (monthIndex) {
            case 1:
            case 2:
            case 12:
                seasonName = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                seasonName = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                seasonName = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                seasonName = "Autumn";
                break;
        }
        return seasonName;
    }
}
