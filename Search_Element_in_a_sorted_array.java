// Question: Given a sorted array arr[] of N integers and a number K is given. The task is to check if the element K is
//           present in the array or not. Note: Use binary search to solve the problem
//           The first line of input contains a number of test cases T. For each test case, first line of input
//           contains a number of elements in the array, and the number K separated by space. The next line
//           contains N elements.
// Inputs:   2
//           5 6
//           1 2 3 4 6
//           5 2
//           1 3 4 5 6
// Output:   1
//          -1

import java.util.*;
public class Search_Element_in_a_sorted_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int size = input.nextInt();
            int element = input.nextInt();
            int [] arr = new int [size];
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }
            int low = 0;
            int high = arr.length-1;
            boolean flag = false;
            while (low <= high) {
                int mid = low+(high-low)/2;
                if (arr[mid] == element) {
                    System.out.println(1);
                    flag = true;
                    break;
                }
                else if (arr[mid] > element) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            if (flag == false)
            System.out.println(-1);
            tests--;
        }
    }
}
