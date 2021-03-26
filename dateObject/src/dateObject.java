import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class dateObject {

    // object for waiting
    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    public static void main (String[] args) {

        // prints date at the start of the program
        String dateStart = new Date().toString();
        System.out.println("initial 'Date' is " + dateStart);

        // prints the same date, but in other format
        LocalDate dateStart2 = LocalDate.now();
        System.out.println("initial 'LocalDate' is " + dateStart2);

        // gets desired time to wait input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("how many second do you want to wait? ");
        int delay = scan.nextInt();

        // prints a statement with current time and the predicted time, which will be after the delay will have passed
        Date dateNow = new Date();
        Date dateExpected = new Date(dateNow.getTime() + TimeUnit.SECONDS.toMillis(delay));
        System.out.println("currently, it is '" + dateNow + "',\nand in " + delay + " seconds it will be '" + dateExpected + "'.");

        // countdown
        for(int i = delay; i > 0; i--) { System.out.println(i); pause(1000); }

        // prints date after the delay time has elapsed
        String dateDelayed = new Date().toString();
        System.out.println("after said delay, it is '" + dateDelayed + "' currently.");

        pause(2000);

        // calculates and prints the date of my bday and the date when i will have lived ten thousand days
        LocalDate Bday = LocalDate.of(2000, 7, 14);
        LocalDate Bday10kDaysLater = Bday.plusDays(10000);
        System.out.print("my bday is on '" + Bday + "' and i will be 10k days old on '" + Bday10kDaysLater + "'.\n");

        pause(2000);

        System.out.println("Thanks for using this program. Have a great day!");
    }
}
