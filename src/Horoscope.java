public class Horoscope {
    private int day;
    private int month;

    public Horoscope(int day, int month) {
        this.day = day;
        this.month = month;
    }

    public String getHoroscopeName() {
        String horoscopeName = "";
        switch (month) {
            case 12:
                if (day < 22)
                    horoscopeName = "Sagittarius";
                else
                    horoscopeName = "capricorn";
                break;
            case 1:
                if (day < 20)
                    horoscopeName = "Capricorn";
                else
                    horoscopeName = "aquarius";
                break;
            case 2:
                if (day < 19)
                    horoscopeName = "Aquarius";
                else
                    horoscopeName = "pisces";
                break;
            case 3:
                if (day < 21)
                    horoscopeName = "Pisces";
                else
                    horoscopeName = "aries";
                break;
            case 4:
                if (day < 20)
                    horoscopeName = "Aries";
                else
                    horoscopeName = "taurus";
                break;
            case 5:
                if (day < 21)
                    horoscopeName = "Taurus";
                else
                    horoscopeName = "gemini";
                break;
            case 6:
                if (day < 21)
                    horoscopeName = "Gemini";
                else
                    horoscopeName = "cancer";
                break;
            case 7:
                if (day < 23)
                    horoscopeName = "Cancer";
                else
                    horoscopeName = "leo";
                break;
            case 8:
                if (day < 23)
                    horoscopeName = "Leo";
                else
                    horoscopeName = "virgo";
                break;
            case 9:
                if (day < 23)
                    horoscopeName = "Virgo";
                else
                    horoscopeName = "libra";
                break;
            case 10:
                if (day < 23)
                    horoscopeName = "Libra";
                else
                    horoscopeName = "scorpio";
                break;
            case 11:
                if (day < 22)
                    horoscopeName = "scorpio";
                else
                    horoscopeName = "sagittarius";
                break;
        }
        return horoscopeName;
    }
}
