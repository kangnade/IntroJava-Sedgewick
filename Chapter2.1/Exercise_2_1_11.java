import java.util.*;

public class Exercise_2_1_11 {
    // Write a static method lg() that takes an int value N as argument
    // and returns the largest int not larger than the base-2 logarithm
    // of N. Do not use Math library.

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the base of log: ");
        int base = in.nextInt();
        System.out.print("Please enter the number x: ");
        int x = in.nextInt();
        System.out.print("The result of " + x + " given a base of " + base +" is: " + lg(base, x));
    }

    public static int lg(int base, int x){
        int result = 0;
        while(x >= base){
            x /= base;
            result++;
        }
        return result;
    }
}
