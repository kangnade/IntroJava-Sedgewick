import java.util.*;

public class Exercise_2_1_1 {
    // Write a static method max3() that takes three int values
    // as arguments and returns the value of the largest one.
    // Add an overloaded function that does the same thing with
    // three double values.

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        int first = in.nextInt();
        System.out.println("Please enter an integer: ");
        int second = in.nextInt();
        System.out.println("Please enter an integer: ");
        int third = in.nextInt();

        System.out.println("Please enter an double value: ");
        double firstD = in.nextDouble();
        System.out.println("Please enter an double value: ");
        double secondD = in.nextDouble();
        System.out.println("Please enter an double value: ");
        double thirdD = in.nextDouble();

        System.out.println("The largest integer among the three is: " + max3(first, second, third));
        System.out.println("The largest double value among the three is: " + max3(firstD, secondD, thirdD));

    }

    // max3() static method with int arguments
    public static int max3(int a, int b, int c){
        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        return max;
    }

    // Overloaded max3() with double arguments
    public static double max3(double a, double b, double c){
        double max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        return max;
    }
}
