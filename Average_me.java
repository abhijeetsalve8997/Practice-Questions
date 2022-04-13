// Question: There are N trees in Terry's front yard. He is supposed to measures the height of each tree and
//           find the average height of trees in his yard. What is the average height of a tree in Terry's front
//           yard?
//           Note:- Print your answer as floor value (average height)
// Input:    N = 5, Array elements = 6 8 34 9 3
// Output:   12 (average height)
// Input:    N = 3, Array elements = 1 2 3
// Output:   3 (average height)

import java.util.*;
public class Average_me {
        public static void main (String[] args) {
            // Your code here
            Scanner input = new Scanner(System.in);

            int N = input.nextInt();
            int average [] = new int[N];
            // loop for taking user inputs
            for(int i = 0; i < average.length; i++) {
                average[i] = input.nextInt();
            }
            long sum = 0;
            // loop for output
            for(int i = 0; i < average.length; i++) {
                sum = sum + average[i];
            }
            long avg = sum/N;
            System.out.print(avg);
        }
    }
