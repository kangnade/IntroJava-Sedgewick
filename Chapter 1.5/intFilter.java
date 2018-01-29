import java.util.*;

// This is the solution of Sedgewick Java Chapter 1.5 exercise 1.5.6

public class intFilter {
    public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         ArrayList<Integer> inputs = new ArrayList<Integer>();
         System.out.println("Please enter integers as you wish, Q to quit: ");

         while(in.hasNextInt()){
             inputs.add(in.nextInt());
         }

         System.out.println("The original inputs are: " + inputs.toString());
         System.out.print("The filtered inputs are: " + intFilter(inputs));
    }

    /**
     * This is a static method that filters inputs by removing repeated values
     * @param input reads an ArrayList that holds the inputs
     * @return returns String format of the filtered ArrayList
     */

    public static String intFilter(ArrayList<Integer> input){
        // We initiate a new ArrayList called result to hold results
        ArrayList<Integer> result = new ArrayList<Integer>();

        // We iterate through the input, if the result ArrayList is empty
        // we add the first input element. Then if the next input element
        // is NOT equal to the last result element, we add this input element
        // to the result list. Otherwise, we do nothing but continue iterating
        // the input ArrayList
        for(int i = 0; i < input.size(); i++){
            if(result.isEmpty()){
                result.add(input.get(i));
            }else{
                if(!input.get(i).equals(result.get(result.size()-1))){
                    result.add(input.get(i));
                }
            }
        }
        return result.toString();
    }
}
