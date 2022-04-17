// Question: You are given a string your task is to reverse the given string.
import java.util.*;
public class Reverse_String {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] arr = s.toCharArray();
        char [] arr1 = new char [arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            arr1[k] = arr[i];
            k++;
        }
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j]);
        }
    }
}
