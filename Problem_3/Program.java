package study;
import java.io.*;
import java.text.ParseException;
import static study.Holiday.*;
import static study.NewCalendar.*;
/* Задача 3
Создать класс Календарь с внутренним классом,
с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
    */
public class Program {

    public static void main(String[] args) throws IOException, ParseException {
        NewCalendar newCalendar = new NewCalendar("01-01-2020", "31-12-2023");
        NewCalendar.WeekendAndHoliday weekendAndHoliday = newCalendar.new WeekendAndHoliday();
        weekendAndHoliday.calcNumberWeekend(newCalendar.getStartDay(), newCalendar.getEndDay());
        weekendAndHoliday.calcNumberHoliday(newCalendar.getStartDay(), newCalendar.getEndDay());
        System.out.println("Временной интервал от " + df.format(newCalendar.getStartDay().getTime()) +
                " до " + df.format(newCalendar.getEndDay().getTime()) + ':');
        System.out.println("количество выходных дней - " + weekendAndHoliday.getNumberWeekend());
        System.out.println("количество праздничных дней - " + weekendAndHoliday.getNumberHoliday());
    }
}
