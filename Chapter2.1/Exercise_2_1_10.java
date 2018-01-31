import java.util.*;

public class Exercise_2_1_10 {
    // Write a static method lg() that takes a double value N as
    // argument and returns the base 2 logarithm of N. You may use
    // Java's Math library.

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a double value > 0: ");
        double input = in.nextDouble();
        System.out.print("The base 2 logarithm of " + input +" is: " + lg(input));
    }

    public static double lg(double x){
        // We have to calculate the base 2 logarithm
        // However, this cannot be done directly
        // Using the formula log a(b) = lnb/lna

        if(x <= 0){
            throw new IllegalArgumentException("x should be greater than 0");
        }

        double result = Math.log10(x) / Math.log10(2);

        return result;
    }
}
