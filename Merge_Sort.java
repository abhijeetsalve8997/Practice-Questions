// Question: Given an unsorted array, your task is to sort the array using merge sort.
// Input:    2
//           3
//           3 1 2
//           3
//           4 5 6
// Output:   1 2 3
//           4 5 6

import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sort {
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
            System.out.print(Arrays.toString(mergeSort(arr,low,high)));
            tests--;
            System.out.println();
        }
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        if (low < high) // atleast we have two elements in array
        {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, mid, low, high);
        }
        return arr;
    }

    public static void merge(int[] arr, int mid, int low, int high) {
        int[] tempArr = new int[arr.length];
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                tempArr[k] = arr[i];
                i++;
            } else {
                tempArr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (j <= high) {
            tempArr[k] = arr[j];
            j++;
            k++;
        }
        while (i <= mid) {
            tempArr[k] = arr[i];
            i++;
            k++;
        }
        if (high + 1 - low >= 0) System.arraycopy(tempArr, low, arr, low, high + 1 - low);
    }
}
