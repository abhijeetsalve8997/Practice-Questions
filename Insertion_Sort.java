// Question: Given an array A[] of size N, containing positive integers. You need to sort the elements of
//           array using Insertion sort algorithm. First line of the input denotes number of test cases T.
//           First line of the testcase is the size of array N and second line consists of array elements separated by space.
//           2 (TC's)
//           5 (1st TC size)
//           4 1 3 9 7 (elements of 1st TC)
//           10 (2nd TC size)
//           10 9 8 7 6 5 4 3 2 1 (elements of 2nd TC)
//           1 3 4 7 9 (Output of 1st TC)
//           1 2 3 4 5 6 7 8 9 10 (Output of 2nd TC)
import java.util.*;
public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int arr[] = new int[size];
            // loop for user inputs
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            // loop for core logic
            for (int a = 1; a < size; a++) {
                int temp = arr[a];
                int j = a - 1;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
            for (int k = 0; k < size; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
            testCases--;
        }
    }
}
