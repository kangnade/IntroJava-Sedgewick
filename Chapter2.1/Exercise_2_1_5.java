import java.util.*;

public class Exercise_2_1_5 {
    // Write a static method areTriangular() that takes three double
    // values as arguments and return true if they could be the sides
    // of a triangle (none of them is greater than or equal to the sum
    // of the other two.

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter three double values: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        System.out.println("The three sides: "+a+", "+b+", "+c+" are sides of triangle: " + areTriangular(a, b, c));
    }

    public static boolean areTriangular(double a, double b, double c){
        if(a >= b + c){
            return false;
        }else if(b >= a + c){
            return false;
        }else if(c >= a + b){
            return false;
        }else return true;
    }
}
