import java.util.GregorianCalendar;

public class C9E5 {
    public static void main(String[] args) {
        System.out.println("This tool is to use GregorianCalendar to output some information.\n");
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("The current year is " + gc.get(GregorianCalendar.YEAR));
        System.out.println("The current month is " + gc.get(GregorianCalendar.MONTH));
        System.out.println("The current day is " + gc.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("\nNow output the year, month and the day of 1234567898765 seconds from 1/1/1970.");
        gc.setTimeInMillis(1234567898765L);
        System.out.println("The year is " + gc.get(GregorianCalendar.YEAR));
        System.out.println("The month is " + gc.get(GregorianCalendar.MONTH));
        System.out.println("The day is " + gc.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
