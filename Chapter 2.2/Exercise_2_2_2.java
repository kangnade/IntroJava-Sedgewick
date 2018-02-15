import java.util.*;

public class Exercise_2_2_2 {
    // Write a static method library that implements the hyperbolic trigonometric
    // functions based on the definitions sinh(x) = (e^x - e^-x)/2 and cosh(x) =
    // (e^x + e^-x)/2, with tanh(x), coth(z), sech(x), and csch(x) defined in a manner
    // analogous to standard trigonometric functions.

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("The actual result of trigonometric values of 45 are: ");
        System.out.printf("sinh(45): %2.2f, cosh(45): %2.2f, tanh(45): %2.2f", sinh(45),cosh(45), tanh(45));
        System.out.printf("coth(45): %2.2f, sech(45): %2.2f, csch(45): %2.2f", coth(45),sech(45), csch(45));

        System.out.println("The expected result of trigonometric values of 45 are: ");
        System.out.printf("sinh(45): %2.2f, cosh(45): %2.2f, tanh(45): %2.2f", Math.sqrt(2)/2,Math.sqrt(2)/2, 1.00);
        System.out.printf("coth(45): %2.2f, sech(45): %2.2f, csch(45): %2.2f", 2/Math.sqrt(2),2/Math.sqrt(2), 1.00);

        System.out.println("Please enter a theta value: ");
        double theta = in.nextDouble();
        System.out.println("The actual result of trigonometric values of your input" + theta + " are: ");
        System.out.printf("sinh(45): %2.2f, cosh(45): %2.2f, tanh(45): %2.2f", sinh(theta),cosh(theta), tanh(theta));
        System.out.printf("coth(45): %2.2f, sech(45): %2.2f, csch(45): %2.2f", coth(theta),sech(theta), csch(theta));
    }

    /**
     * Return the sinh value from the input
     * @param x is the input of degree from 0 to 360
     * @return returns the sinh(x) value of x
     */
    public static double sinh(double x){
        double input = x*Math.PI/180;
        return (Math.exp(input) - Math.exp(-input))/2;
    }

    /**
     *  Return the cosh value from input x
     * @param x is the input of degree from 0 to 360
     * @return returns the cosh(x) value of x
     */
    public static double cosh(double x){
        double input = x*Math.PI/180;
        return (Math.exp(input) + Math.exp(-input))/2;
    }

    /**
     * Return the tanh value from input x
     * @param x is the input of degree from 0 to 360
     * @return returns the tanh(x) value of x
     */
    public static double tanh(double x){
        double input = x*Math.PI/180;
        return sinh(input)/cosh(input);
    }

    /**
     * Return the coth value from input x
     * @param x is the input of degree from 0 to 360
     * @return returns the coth(x) value of x
     */
    public static double coth(double x){
        double input = x*Math.PI/180;
        return cosh(input)/sinh(input);
    }

    /**
     * Return the sech value from input x
     * @param x is the input of degree from 0 to 360
     * @return returns the sech(x) value of x
     */
    public static double sech(double x){
        double input = x*Math.PI/180;
        return 1 / cosh(input);
    }

    /**
     * Return the csch value of input x
     * @param x is the input of degree from 0 to 360
     * @return returns the csch(x) value of x
     */
    public static double csch(double x){
        double input = x*Math.PI/180;
        return 1 / sinh(input);
    }
}
