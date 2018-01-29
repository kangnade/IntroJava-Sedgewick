import java.util.*;

// This is the solution of Sedgewick Java's exercise 1.5.8
// Write a program that reads in positive real numbers from standard
// input and prints out their geometric and harmonic means.
// Hint: for the geometric mean, consider taking logs to avoid overflow

public class geoHarmoMeans {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Double> input = new ArrayList<Double>();

        System.out.print("Please enter positive numbers, Q to quit: ");
        while(in.hasNextDouble()){
            input.add(in.nextDouble());
        }

        System.out.println("The list of numbers is: " + input.toString());
        System.out.println("The geometric mean is: " +geometricMean(input));
        System.out.println("The harmonic mean is: " +harmonicMean(input));
    }

    public static double geometricMean(ArrayList<Double> input){
        int n = input.size();
        double sum = 0.0;

        for(int i = 0; i < input.size();i++){
            sum += Math.log(input.get(i));
        }
        return Math.exp(sum / n);
    }

    public static double harmonicMean(ArrayList<Double> input){
        int n = input.size();
        double sum = 0;

        for(int i = 0; i < input.size(); i++){
            sum += 1 / input.get(i);
        }
        return sum / (1 / n);
    }
}
