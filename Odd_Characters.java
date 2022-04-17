// Question:Given a string(1-indexed). Print all the characters of the string at odd positions
// Input:   abcde
// Output:  a c e
// Input:   abcd
// Output:  a c

import java.util.*;
public class Odd_Characters {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        String S = sc.nextLine();
        char [] arr = S.toCharArray();
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.print(arr[i]+" ");
        }
    }
}
