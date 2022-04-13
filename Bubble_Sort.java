// Question: Given an array A[], of size N containing positive integers. You need to print the elements of array
//           in increasing order. First line of the input denotes the number of test cases 'T'. First line of the
//           test case is the size of array and second line consists of array elements.
//           2 (test cases)
//           5 (test case 1: size)
//           4 1 3 9 7 (elements of test case 1)
//           10 (test case 2: size)
//           10 9 8 7 6 5 4 3 2 1 (elements of test case 2)
//           1 3 4 7 9 (output of test case 1)
//           1 2 3 4 5 6 7 8 9 10 (output of test case 2)

import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int [] arr = new int [size];
            for (int a = 0; a < arr.length; a++) {
                arr[a] = input.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1-i; j++) {
                    if (arr[j] >= arr[j+1]) {
                        swap (arr, j, j+1);
                    }
                }
            }
            for (int b = 0; b < arr.length; b++) {
                System.out.print(arr[b]+" ");
            }
            tests--;
        }
    }
    public static void swap (int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
