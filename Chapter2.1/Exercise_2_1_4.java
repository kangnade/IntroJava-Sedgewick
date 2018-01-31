import java.util.*;

public class Exercise_2_1_4 {
    // Write a method eq() that takes two arrays of integers as arguments
    // and returns true if they contain the same number of elements and all
    // corresponding pairs of elements are equal

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int m;

        System.out.println("Please enter the number length n for the first array: ");
        n = in.nextInt();
        System.out.println("Please enter the number length m for the first array: ");
        m = in.nextInt();

        int[] arrayA = new int[n];
        int[] arrayB = new int[m];

        for(int i = 0; i < n; i++){
            System.out.print("Please enter the element for the first array: ");
            arrayA[i] = in.nextInt();
        }

        for(int i = 0; i < m; i++){
            System.out.print("Please enter the element for the second array: ");
            arrayB[i] = in.nextInt();
        }

        System.out.println("Test result of the two arrays is: " + eq(arrayA, arrayB));

    }

    /**
     * Compares the length and also the element of two arrays
     * @param a is the first array
     * @param b is the second array
     * @return returns true if the length and element in both arrays are the same, false otherwise
     */
    public static boolean eq(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == b[i]){
                count++;
            }
        }
        return (count - a.length) == 0;
    }
}
