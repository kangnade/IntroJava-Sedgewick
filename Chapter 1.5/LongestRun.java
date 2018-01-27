import java.util.*;

public class LongestRun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int count = 0;
        int longestCount = 0;
        int previous = 0;
        int current;
        int longestNum = 0;

        do {
            System.out.print("Enter an integer, Q to quit: ");
            current = in.nextInt();
            if(count == 0){
                previous = current;
                count = 1;
            }else{
                if(current == previous){
                    count++;
                }else{
                    previous = current;
                    count = 1;
                }
            }

            if(count > longestCount){
                longestCount = count;
                longestNum = current;
            }
        }while(in.hasNextInt());
        System.out.println("Longest consecutive int: " + longestNum + " with: " + longestCount +"s");
    }
}
