import java.util.*;

public class Exercise_2_1_18 {
    // Write a static method that takes an array of double values as argument and rescale the array
    // so that each element is between 0 and 1 ( by subtracting the minimum value from each element
    // and the dividing each element by the difference between the minimum and maximum values).
    // Use the max() method defined in the table in the text, and write and use a matching min() method

    public static void main(String[] args){
        // The main class to test the static methods
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number N to indicate the length of the array: ");
        int n = in.nextInt();
        double[] input = new double[n];
        for(int i = 0; i < n; i++){
            System.out.print("Please enter the " + (i+1) + "th element: ");
            input[i] = in.nextDouble();
        }
        System.out.println("The original array is: ");
        printArray(input);
        System.out.print("The rescaled version of array is: " );
        printArray(rescale(input));
    }

    public static double max(double[] input){
        // Return the maximum value in a double array
        double max = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < input.length; i++){
            if(input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static double min(double[] input){
        // Return the minimum value in a double array
        double min = Double.POSITIVE_INFINITY;
        for(int i = 0; i < input.length; i++){
            if(input[i] < min){
                min = input[i];
            }
        }
        return min;
    }

    public static double[] rescale(double[] input){
        // Rescale the whole array so that the values are between
        // 0 and 1
        double[] result = new double[input.length];
        for(int i = 0; i < input.length; i ++){
            result[i] = (input[i] - min(input))/(max(input) - min(input));
        }
        return result;
    }

    public static void printArray(double[] input){
        for(int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
