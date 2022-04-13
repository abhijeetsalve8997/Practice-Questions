// Question: Given an array A of size N, you need to find its maximum, 2nd maximum and 3rd maximum element.
//           Try solving it in O(N) per test case
// Input:    size of array = 5, arr[] = {1,4,2,4,5}
// Output:   5,4,4
// Input:    size of array = 6, arr[] = {1,3,5,7,9,8}
// Output:   9,8,7
// Input:    size of array = 7, arr[] = {11,22,33,44,55,66,77}
// Output:   77,66,55
import java.util.*;
public class Max_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int [] arr = new int [size];
            for (int a = 0; a < arr.length; a++) {
                arr[a] = input.nextInt();
            }
            Arrays.sort(arr);
            // 1st Approach:
            for (int b = arr.length-1; b > arr.length-4; b--) {
                System.out.print(arr[b]+" ");
            }
            // 2nd Approach:
            for (int b = 0; b < 3; b++) {
                System.out.print(arr[N-1-i]+" ");
            }
            tests--;
        }
    }
}
