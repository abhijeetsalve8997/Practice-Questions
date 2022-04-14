// Question: Given an array A[] having N positive integers. You need to arrange these elements in increasing
//           order using Quick Sort algorithm.
// Input:    2
//           3
//           3 1 2
//           3
//           4 5 6
// Output:   1 2 3
//           4 5 6

import java.util.Arrays;
import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int [] arr = new int [size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            int start = 0;
            int end = arr.length-1;
            System.out.print(Arrays.toString(quickSort(arr,start,end)));
            tests--;
            System.out.println();
        }
    }
    public static int[] quickSort (int []arr, int start, int end){
        if (start < end) {
            int corrected = partition(arr, start, end);
            quickSort(arr,start, corrected-1);
            quickSort(arr, corrected+1, end);
        }
        return arr;
    }
    public static int partition (int []arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap (arr,i,j);
            }
        }
        i++;
        swap (arr,i,end);
        return i;
    }
    public static void swap (int []arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
