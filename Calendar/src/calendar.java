import java.time.DayOfWeek;
import java.time.LocalDate;

public class calendar {
    public static void main (String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();   // saves current month
        int today = date.getDayOfMonth();   // saves current day

        date = date.minusDays(today - 1);   // sets date to the first day of the current month
        int value = date.getDayOfWeek().getValue(); // saves the value for todays day -> 1-7 : Mon-Sun

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < value; i++)  // prints empty spaces in the first row, until the first day of the month
            System.out.print("    ");
        while(date.getMonthValue() == month) {  // while(month of 'date' is the same as the current 'month)
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)   // prints an asterisk if 'date' is 'today'
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);    // increases 'date' by a day
            if(date.getDayOfWeek().getValue() == 1) System.out.println();   // if monday => \n
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
