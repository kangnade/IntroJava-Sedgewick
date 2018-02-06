import java.util.*;

public class Exercise_2_1_22 {
    // Write a method any() that takes an array of boolean values as argument and returns
    // true if any of the entries in the array is true, and false otherwise. Write a method
    // all() that takes any array of boolean values as argument and returns true if all of the
    // entries in the array are true, and false otherwise.

    public static void main(String[] args){
        // Main class that tests the all() and any() methods
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number that indicates the length of the array: ");
        int n = in.nextInt();
        boolean[] input = new boolean[n];
        for(int i = 0; i < n; i++){
            System.out.print("Please enter the " + (i+1) + "th boolean element:");
            input[i] = in.nextBoolean();
        }
        System.out.print("Using the all() method, the result is: ");
        printBoo(all(input));
        System.out.println();
        System.out.print("Using the any() method, the result is: ");
        printBoo(any(input));
    }

    public static boolean any(boolean[] input){
        // Returns true if any is true, otherwise false
        for(int i = 0; i < input.length; i++){
            if(input[i] == true){
                return true;
            }
        }
        return false;
    }

    public static boolean all(boolean[] input){
        // Returns true if all are true, otherwise false
        for(int i = 0; i < input.length; i++){
            if(input[i] == false){
                return false;
            }
        }
        return true;
    }

    public static void printBoo(boolean n){
        if(n == true){
            System.out.print("True");
        }else {
            System.out.print("False");
        }

    }
}
