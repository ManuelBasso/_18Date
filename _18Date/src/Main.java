import java.time.MonthDay;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(date);
        //ottieni l'anno
        System.out.println("Year: " +date.getYear());

        //ottieni il mese
        System.out.println("Month: " +date.getMonth());

        //ottieni il giorno
        System.out.println("day: " +date.getDayOfMonth());

        //ottieni il giorno della settimana
        System.out.println("day of the week: " +date.getDayOfWeek());




    }
}