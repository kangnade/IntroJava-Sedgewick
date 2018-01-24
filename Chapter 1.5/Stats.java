import java.util.*;

// This is the solution to Sedgewick Java Exercise 1.5.3 & 1.5.4 without using
// Professor Sedgewick's stdlib library
// I used ArrayList<> as the main solution to these questions. If you are not
// familiar to ArrayList<>, but you want to learn about it, please search this
// on google. If you do not wish to touch on ArrayList<> concept, please refer to Professor
// Sedgewick's Java book's website for answer reference.

public class Stats {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Initiate two ArrayLists to hold both inputs and results after filter method;
        ArrayList<Double> doubleInput = new ArrayList<Double>();

        System.out.println("Please enter an integer: ");
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("Please enter the " + (i+1) + "th value: ");
            double value = in.nextDouble();
            doubleInput.add(value);
        }
        System.out.println("The average value of your inputs is: " + statsAverage(doubleInput)
        + ", and the standard deviation is: " + statsStdDev(doubleInput) +".");
        System.out.print("The values that are 1.5 standard deviation away from the mean are: ");
        System.out.println(filter(doubleInput));
    }

    /**
     * This is a statsAverage method used for calculating average of user inputs
     * @param input ArrayList that holds the user inputs
     * @return returns the double result of average
     */
    public static double statsAverage(ArrayList<Double> input){
        double sum = 0;

        //Use for loop to get the sum of all the user inputs in the ArrayList
        for(int i = 0; i < input.size(); i++){
            sum += input.get(i);
        }

        //If the input ArrayList is an empty list, then return 0, otherwise return average
        if(input.size() > 0){
            return sum / input.size();
        }else{
            return 0;
        }
    }

    /**
     * This is the statsStdDev method that is used to calculate standard deviation
     * @param input the ArrayList that holds the user inputs
     * @return returns double value of the standard deviation of the ArrayList inputs
     */
    public static double statsStdDev(ArrayList<Double> input){
        //Initiate a variable that holds the sum of the squares of the difference between the ith input and mean
        //The (N-1) we used to calculate the StdDev is the length of the input ArrayList minus 1
        double stdDevSum = 0;
        int length = input.size() - 1;

        //We use the statsAverage method above to return the average value
        double average = statsAverage(input);

        //Then we use a for loop to calculate the stdDevSum above
        for(int i = 0; i < input.size(); i++){
            double difference = input.get(i) - average;
            stdDevSum += Math.pow(difference, 2);
        }
        if(input.size() == 0){
            return 0;
        }else {
            return Math.sqrt(stdDevSum / length);
        }
    }

    /**
     * This is a filter method that filter any value 1.5 standard deviation away from mean
     * @param input This is the ArrayList of the user's input
     * @return returns the filtered ArrayList of values
     */
    public static ArrayList<Double> filter(ArrayList<Double> input){
        // Set the filter value to 1.5
        // We need to use the concept of z-score to standardize each input
        // Initiate a new ArrayList to hold the filtered results
        double filterValue = 1.5;
        ArrayList<Double> results = new ArrayList<Double>();
        double stdDev =  statsStdDev(input);
        double stdAverage = statsAverage(input);

        for(int i = 0; i < input.size(); i++){
            // standardize the inputs into z-scores
            double z = (input.get(i) - stdAverage)/ stdDev;
            if(Math.abs(z) >= filterValue){
                results.add(input.get(i));
            }
        }
        return results;
    }
}
