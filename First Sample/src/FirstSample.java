<<<<<<< HEAD
import static java.lang.Math.*;

import java.io.Console;
import java.util.*;

public class FirstSample {
    public static void main(String[] args) {

        // basic print statements
        System.out.println("We will not use 'Hello, World!'");
        System.out.println("toto je tab \u0009 a tu je single quote \u0027 dokonca");
        System.out.println("17/6 is " + 17/6);
        System.out.printf("17.5/6 is %.3f\n", 17.5/6);
        System.out.println("The square root of \u03C0 is " + sqrt(PI));

        // showcase of an integer overflow
        /*
        int x = multiplyExact(1000000000, 3); System.out.println(x); // will throw exception because of integer overflow
        int y = (1000000000 * 3); System.out.println(y); // lets the integer to overflow, resulting in -1294967296
        */

        // another basic printing statements
        Scanner in = new Scanner(System.in); // declaring a new instance of Scanner class
        System.out.print("What is your name? "); String name = in.nextLine(); // gets name from user
        System.out.print("How old are you? "); int age = in.nextInt(); // gets age from user
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1)); // prints a welcome message

        // supposed to scan password, but not storing it as a regular string, or sth
        /*
        // not working
        Console cons = System.console();
        String username = cons.readLine("User name: "); char[] password = cons.readPassword("Password: ");
        System.out.println("username is " + username + " and the password is " + Arrays.toString(password));
        */

        // basic array operations
        int[] poleOG = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for (int i = 0; i < (pole.length - 1); i++) System.out.print(pole[i] + ", "); System.out.println(pole[(pole.length - 1)] + ".");
        System.out.print("pole -\t");  for(int a : poleOG) System.out.print(a + " "); // alternative 'for each' loop in Java
        int[] poleCopy = Arrays.copyOf(poleOG, poleOG.length);
        int[] polePtr = poleOG; polePtr[5] = 12;
        System.out.println();
        System.out.println("poleOG and polePtr should both have changed values at index 5 and poleCopy should have all original the values of poleOG");
        System.out.print("poleOG -\t"); for(int a : poleOG) System.out.print(a + " "); System.out.println();
        System.out.print("polePtr -\t"); for(int a : polePtr) System.out.print(a + " "); System.out.println();
        System.out.print("poleCopy -\t"); for(int a : poleCopy) System.out.print(a + " "); System.out.println();
    }
=======
import static java.lang.Math.*;

import java.io.Console;
import java.util.*;

public class FirstSample {
    public static void main(String[] args) {

        // basic print statements
        System.out.println("We will not use 'Hello, World!'");
        System.out.println("toto je tab \u0009 a tu je single quote \u0027 dokonca");
        System.out.println("17/6 is " + 17/6);
        System.out.printf("17.5/6 is %.3f\n", 17.5/6);
        System.out.println("The square root of \u03C0 is " + sqrt(PI));

        // showcase of an integer overflow
        /*
        int x = multiplyExact(1000000000, 3); System.out.println(x); // will throw exception because of integer overflow
        int y = (1000000000 * 3); System.out.println(y); // lets the integer to overflow, resulting in -1294967296
        */

        // another basic printing statements
        Scanner in = new Scanner(System.in); // declaring a new instance of Scanner class
        System.out.print("What is your name? "); String name = in.nextLine(); // gets name from user
        System.out.print("How old are you? "); int age = in.nextInt(); // gets age from user
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1)); // prints a welcome message

        // supposed to scan password, but not storing it as a regular string, or sth
        /*
        // not working
        Console cons = System.console();
        String username = cons.readLine("User name: "); char[] password = cons.readPassword("Password: ");
        System.out.println("username is " + username + " and the password is " + Arrays.toString(password));
        */

        // basic array operations
        int[] poleOG = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for (int i = 0; i < (pole.length - 1); i++) System.out.print(pole[i] + ", "); System.out.println(pole[(pole.length - 1)] + ".");
        System.out.print("pole -\t");  for(int a : poleOG) System.out.print(a + " "); // alternative 'for each' loop in Java
        int[] poleCopy = Arrays.copyOf(poleOG, poleOG.length);
        int[] polePtr = poleOG; polePtr[5] = 12;
        System.out.println();
        System.out.println("poleOG and polePtr should both have changed values at index 5 and poleCopy should have all original the values of poleOG");
        System.out.print("poleOG -\t"); for(int a : poleOG) System.out.print(a + " "); System.out.println();
        System.out.print("polePtr -\t"); for(int a : polePtr) System.out.print(a + " "); System.out.println();
        System.out.print("poleCopy -\t"); for(int a : poleCopy) System.out.print(a + " "); System.out.println();
    }
>>>>>>> b52e016cf7f2fb6b1ea3cc0cbc5dea42e06779ab
}