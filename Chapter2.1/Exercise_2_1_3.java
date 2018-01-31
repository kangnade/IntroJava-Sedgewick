import java.util.*;

public class Exercise_2_1_3 {
    // Write a static method majority() that takes three boolean arguments
    // and returns true if at least two of the arguments have the value true
    // and false otherwise. Do not use if() statements.
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3 boolean values: ");
        boolean first = in.nextBoolean();
        boolean second = in.nextBoolean();
        boolean third = in.nextBoolean();

        System.out.println(first + " " +second + " " + third);
        System.out.println("Result: " + majority(first, second, third));
    }

    public static boolean majority(boolean a, boolean b, boolean c){
        return (a && b) || (a && c) || (b && c);
    }
}
