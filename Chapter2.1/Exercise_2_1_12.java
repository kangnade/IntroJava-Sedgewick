import java.util.*;


public class Exercise_2_1_12 {
    // Write a static method signum() that takes an int value N as
    // argument and returns -1 if N is less than 0, 0 if N is equal
    // to 0, and +1 if N is greater than 0

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int input = in.nextInt();
        System.out.print(input);
        System.out.println(" has a signum as: " + signum(input));
    }

    public static int signum(int N){
        if(N < 0){
            return -1;
        }else if(N == 0){
            return 0;
        }
        return 1;
    }
}
