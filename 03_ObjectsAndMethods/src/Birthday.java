import java.time.DayOfWeek;
import java.time.LocalDate;
public class Birthday {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1993, 01, 21);
        LocalDate now = LocalDate.now();
        int i = 0;

        while (birthday.isBefore(now)) {
            DayOfWeek nameOfDay = birthday.getDayOfWeek();

            System.out.println(i + " - " + birthday + "-" + nameOfDay);
            i++;
            birthday = birthday.plusYears(1);
        }
    }
}