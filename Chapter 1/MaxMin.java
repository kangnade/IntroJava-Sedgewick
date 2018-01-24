import java.util.*;

public class MaxMin {
    public static void main(String[] args){

        // Create new Scanner in and new ArrayList input
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();

        //Using a do{} while() loop to check and add inputs to ArrayList
        System.out.println("Please enter positive integers as many as you wish, Q to quit: ");
        do {
            int current = in.nextInt();
            if(current > 0){
                input.add(current);
            }else{
                System.out.println("Please enter a positive integer: ");
            }
        }while(in.hasNextInt());

        //Print out the max and min using the maxMinArrayList(input) method
        System.out.println(maxMinArrayList(input));
    }

    /**
     * A method used to compare the max and min in an ArrayList
     * @param input is an ArrayList filled with integers
     * @return return a String statement with max and min
     */
    public static String maxMinArrayList(ArrayList<Integer> input){
        int max = input.get(0);
        int min = max;

        for(int i = 1; i < input.size(); i++){
            int current = input.get(i);
            if(current > max){
                max = current;
            }
            if(current < min){
                min = current;
            }
        }
        return "Max number is: " + max + " and " + "Min number is: " + min;
    }
}
