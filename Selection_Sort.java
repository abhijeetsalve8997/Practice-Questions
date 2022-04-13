// Question: Given an array A[], size N containing positive integers. You need to arrange the elements of
//           array in increasing order. Given an array A[], size N containing positive integers. You need
//           to arrange the elements of array in increasing order.
//           2 (TC)
//           5 (size of 1st TC)
//           4 1 3 9 7 (Elements of 1st TC)
//           10 (size of 2nd TC)
//           10 9 8 7 6 5 4 3 2 1 (Elements of 2nd TC)
//           1 3 4 7 9 (output of 1st TC)
//           1 2 3 4 5 6 7 8 9 10 (output of 2nd TC)


import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int size = sc.nextInt();
            int [] arr = new int[size];
            // loop for user inputs
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            for (int j = 0; j < size - 1; j++) {
                int small = j;
                for (int k = j + 1; k < size; k++) {
                    if (arr[k] < arr[small]) {
                        small = k;
                    }
                }
                int temp = arr[small];
                arr[small] = arr[j];
                arr[j] = temp;
            }
            for (int b = 0; b < size; b++) {
                System.out.print(arr[b]+" ");
            }
            System.out.println();
            testCases--;
        }
    }
}