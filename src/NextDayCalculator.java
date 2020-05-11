public class NextDayCalculator {
    public static String nextDay(int day, int month, int year) {
        int outputDay=day;
        int outputMonth=month;
        int outputYear=year;
        if (month==2) {
            outputMonth = ++month;
            outputDay = 1;
        } else if (day == 31||day==30) {
            outputMonth = ++month;
            outputDay = 1;
        } else {
            outputDay = ++day;
        }
        return outputDay + "/" + outputMonth + "/" + outputYear;
    }


    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
