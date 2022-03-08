import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Time {

    public static void main(String[] args) {
        milliSecToEpoch();
 //       timeStamp();
    }

    private static void milliSecToEpoch() {
        LocalDateTime now = LocalDateTime.ofEpochSecond(System.currentTimeMillis()/1000,
                0, ZoneOffset.ofHours(3));
        System.out.println(now);
    }

    private static void timeStamp(){

        long start = System.currentTimeMillis();
        String line = "";
        for (int i = 0; i < 100; i++) {
            line = line + Math.random();
        }
//        System.out.println(line);
 //       System.out.println(System.currentTimeMillis() - start);
        System.out.println(start/1000);
    }

    public static void lessonTime() {

//вычетания и сложения
        LocalDateTime time1 = LocalDateTime.now();
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(time2.plusMinutes(1));
//Cравнения
        LocalDateTime time3 = LocalDateTime.now();
        LocalDateTime time4 = LocalDateTime.now();
        System.out.println(time3.isAfter(time4));
        System.out.println(time3.isBefore(time4));
//В данном случае возвращается -1, 0 или +1. Если неверно, ровно и верно соответственно.
        System.out.println(time3.compareTo(time4));

//Если нужно вычислить разницу между 2мя методами
        System.out.println("Разница в заданных еденицах: " + time4.until(time3, ChronoUnit.NANOS));


//Если нужно создать сегодняшний день:
        LocalDate today = LocalDate.now();
        System.out.println(today);


//если нам нужно получить текущее время:
        LocalDateTime todayTime = LocalDateTime.now();
        System.out.println(todayTime);


//Если нужно создать дату из какой-то имеющейся информации:
        LocalDate birthday = LocalDate.of(1993,01,21);
        System.out.println(birthday);


//Если нужно выполнить какие-либо сложения или вычетания:
        System.out.println(birthday.plusYears(18));
        System.out.println(birthday.minusMonths(9));


//Если нужно получить текущее время в другом часовом поясе:
        LocalDateTime nowInNY = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(nowInNY);


//Парсинг в форматтере. Строка форматирутся в объект.
        String myDate = "29/02/1993";
        DateTimeFormatter xxxFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate xxxLocalDate = LocalDate.parse(myDate, xxxFormater);
        System.out.println(xxxLocalDate);


//Форматируем объект в строку. Форматируем текущую дату, например:
        DateTimeFormatter xxFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(xxFormatter.format(now));


// Форматируем по заданному шаблону из метода
        DateTimeFormatter nowFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("Шаблон: " + nowFormatter.format(now2));


    }
}