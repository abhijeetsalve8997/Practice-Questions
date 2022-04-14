// Question: Given an array A of size N containing 0's, 1's and 2's. The task is to segregate the 0's,
//           1's and 2's in the array as all the 0's should appear in the first part of the array, 1's should
//           appear in middle part of the array and finally all the 2's in the remaining part of the array.
//           Note: Do not use inbuilt sort function. Try to solve in O(N) per test case
//           The first line contains an integer T denoting the total number of test cases. Then T testcases
//           follow. Each testcases contains two lines of input. The first line denotes the size of the array N.
//           The second lines contains the elements of the array A separated by spaces.
//           2
//           5
//           0 2 1 2 0
//           3
//           0 1 0

import java.util.*;
public class Array_012_Elements {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int [] arr = new int [size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            int low = 0;
            int high = arr.length-1;
            int i = low;
            while (i <= high) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[low];
                    arr[low] = temp;
                    i++;
                    low++;
                }
                else if (arr[i] == 1) {
                    i++;
                }
                else {
                    int temp = arr[i];
                    arr[i] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
            for (int j = 0; j < size; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
            tests--;
        }
    }
}
