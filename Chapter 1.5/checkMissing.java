import java.util.*;
// This is the solution to Sedgewick Java's exercise 1.5.7
// Write a program that takes a command-line argument N, reads
// in N-1 distinct integers between 1 and N, and determines the
// missing value(s).

public class checkMissing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();
        int number;

        System.out.print("Please enter a number, it will be referred as N: ");
        number = in.nextInt();

        System.out.println("Then, please enter a sequence of numbers between and including 1 and N, Q to quit: ");

        while(in.hasNextInt()){
            input.add(in.nextInt());
        }

        System.out.println("The missing values in your inputs are: " + checkMiss(number, input));
    }

    public static String checkMiss(int num, ArrayList<Integer> input){
        ArrayList<Integer> complete = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < num; i++){
            complete.add(i+1);
        }

        for(int i = 0; i < num; i++){
            if(!input.contains(complete.get(i))){
                result.add(complete.get(i));
            }
        }
        System.out.println("Complete list is: " + complete.toString());
        System.out.println("Input is: " + input.toString());
        return result.toString();
    }
}
