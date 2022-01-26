/***
 * Program to print out price of eggs, days of the week and the date I did this part of the lab
 * @author mcledera
 */

import java.text.DateFormatSymbols;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintInternationalInformation {

    public static void main(String[] args) {
        // Price of dozen eggs
        double eggsFR = 3;
        double eggsDE = 2.26;
        double eggsGB = 1.93;

        // Three locale objects
        Locale french = new Locale("fr", "FR");
        Locale german = new Locale("de", "DE");
        Locale enUK = new Locale("en", "GB");

        // Currency of locale for eggs
        NumberFormat frCurrencyForm = NumberFormat.getCurrencyInstance(french);
        NumberFormat deCurrencyForm = NumberFormat.getCurrencyInstance(german);
        NumberFormat ukCurrencyForm = NumberFormat.getCurrencyInstance(enUK);

        System.out.println("Cost of eggs in each locale: ");
        System.out.println("France: " + frCurrencyForm.format(eggsFR));
        System.out.println("Germany: " + deCurrencyForm.format(eggsDE));
        System.out.println("UK: " + ukCurrencyForm.format(eggsGB) + "\n\n");

        // Days of the week for each locale
        DateFormatSymbols frDfs = new DateFormatSymbols(french);
        DateFormatSymbols deDfs = new DateFormatSymbols(german);
        DateFormatSymbols ukDfs = new DateFormatSymbols(enUK);

        String frDayNames[] = frDfs.getWeekdays();
        String deDayNames[] = deDfs.getWeekdays();
        String ukDayNames[] = ukDfs.getWeekdays();

        // Print out the days of the week by looping them
        System.out.println("The days of the week in French:");
        for (int days = 1; days < frDayNames.length; days++) {
            System.out.println(frDayNames[days]);
        }

        System.out.println();

        System.out.println("The days of the week in German");
        for (int days = 1; days < deDayNames.length; days++) {
            System.out.println(deDayNames[days]);
        }

        System.out.println();

        System.out.println("Days of the week in UK English");
        for (int days = 1; days < ukDayNames.length; days++) {
            System.out.println(ukDayNames[days]);
        }

        System.out.println();

        // Today's date I did this lab
        LocalDate localDate = LocalDate.of(2021, 02, 21);

        // Format the date
        String dateInFR = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", french));
        String dateInDE = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", german));
        String dateInGB = localDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", enUK));
        System.out.println("Date in French: " + dateInFR);
        System.out.println("Date in German: " + dateInDE);
        System.out.println("Date in UK English, no difference... : " + dateInGB);


    }
}
