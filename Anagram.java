// Question: Given two strings a and b consisting of lowercase characters. The task is to check whether two given
//           strings are an anagram of each other or not. An anagram of a string is another string that contains
//           the same characters, only the order of characters can be different. For example, “act” and “tac” are
//           an anagram of each other.
// Input:    naman
//           manan
// Output:   YES

import java.util.*;
public class Anagram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String input1 = sc.next();
            String input2 = sc.next();
            if (input1.length() != input2.length()) {
                System.out.println(input1 + " and " + input2 + " are not anagram");
            } else {
                char[] arr1 = input1.toCharArray();
                char[] arr2 = input2.toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    System.out.println(input1 + " and " + input2 + " are anagram");
                } else {
                    System.out.println(input1 + " and " + input2 + " are not anagram");
                }
            }
            test--;
            System.out.println();
        }
    }
}
