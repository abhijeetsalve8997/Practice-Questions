// Question: Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once),
//           output an array such that A[i] becomes A[A[i]]. Make sure you don't use extra memory than array itself.
// Input:    Size of Array: 5, Array = 4 2 3 0 1
// Output:   1 3 0 4 2
// Input:    Size of Array: 10, Array = 9 5 1 4 7 8 0 6 3 2
// Output:   2 8 5 7 6 3 9 0 4 1

import java.util.*;
public class Simple_Arrangement {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int [] arr = new int [size];
            for (int a = 0; a < arr.length; a++) {
                arr[a] = input.nextInt();
            }
            for (int b = 0; b < arr.length; b++) {
                System.out.print(arr[arr[b]]+" ");
            }
        }
    }
}
