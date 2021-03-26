import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Lottery {
    public static void main(String[] args) {

        // take the initial input values
        Scanner in = new Scanner(System.in);
        out.print("How many numbers do you want to draw? "); int k = in.nextInt();
        out.print("What is the maximum selectable number? "); int n = in.nextInt();

        // create a set of all available numbers
        int[] numberSet = new int[n];
        for(int i = 0; i < numberSet.length; i++) numberSet[i] = i + 1;

        int[] result = new int[k];
        for(int i = 0; i < result.length; i++) {
            int r = (int) (random() * n);
            result[i] = numberSet[r];
            numberSet[r] = numberSet[n - 1];
            n--;
        }

        sort(result);
        out.println("Bet the following combination. It'll make you rich!");
        for(int r : result) out.println(r);
    }
}