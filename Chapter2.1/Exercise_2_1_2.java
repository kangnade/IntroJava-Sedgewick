import java.util.*;

public class Exercise_2_1_2 {
    // Write a static method odd() that takes three boolean inputs
    // and returns true if an odd number of inputs are true, and false
    // otherwise
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3 boolean values: ");
        boolean first = in.nextBoolean();
        boolean second = in.nextBoolean();
        boolean third = in.nextBoolean();

        System.out.println(first + " " +second + " " + third);
        System.out.println("Result: " + odd(first, second, third));
    }
    public static boolean odd(boolean a, boolean b, boolean c){
        int count = 0;
        if(a) count++;
        if(b) count++;
        if(c) count++;

        return count % 2 != 0;
    }
}
