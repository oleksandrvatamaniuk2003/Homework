import java.util.Calendar;
import java.util.GregorianCalendar;

public class Friday13th {
    public static void main(String[] args) {
        int maxDaysWithoutFriday13 = findMaxDaysWithoutFriday13();
        System.out.println("Maksymalna kilkist' dniv bez Pyatnytsi 13-go: " + maxDaysWithoutFriday13);
    }
    public static int findMaxDaysWithoutFriday13() {
        int maxDaysWithoutFriday13 = 0;

        for (int year = 1600; year < 2000; year += 400) {
            int daysWithoutFriday13 = countDaysWithoutFriday13(year);

            if (daysWithoutFriday13 > maxDaysWithoutFriday13) {
                maxDaysWithoutFriday13 = daysWithoutFriday13;
            }
        }

        return maxDaysWithoutFriday13;
    }

    public static int countDaysWithoutFriday13(int year) {
        int daysWithoutFriday13 = 0;
        Calendar calendar = new GregorianCalendar();

        for (int month = 0; month < 12; month++) {
            for (int day = 1; day <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); day++) {
                calendar.set(year, month, day);

                if (calendar.get(Calendar.DAY_OF_MONTH) == 13 && calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                    break;
                }

                daysWithoutFriday13++;
            }
        }

        return daysWithoutFriday13;
    }
}