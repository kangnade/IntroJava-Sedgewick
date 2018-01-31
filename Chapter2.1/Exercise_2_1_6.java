import java.util.*;

public class Exercise_2_1_6 {
    // Write a static method sigmoid() that takes a double argument
    // x and returns the double value obtained from the formula
    // 1/(1-e^-x)

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double input = in.nextDouble();
        System.out.println("The value of 1/(1-e^(-x)) given your number x is: " + sigmoid(input));
    }

    /**
     * Calculates the value of 1/(1-(e^-x))
     * @param x is a double argument
     * @return returns the value of 1/(1-(e^-x)) given x as an input
     */
    public static double sigmoid(double x){
        // when x equals 0, the value of e^-x is 1
        // in this case, the denominator is (1-1) = 0
        // we have to handle this exception by throwing exception
        if(x == 0.0){
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        }
        double result = 1 / (1 - Math.exp(-x));
        return result;
    }
}
