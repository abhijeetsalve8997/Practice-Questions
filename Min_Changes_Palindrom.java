// Question: Given a string S find minimum number of changes required to make the string palindrome. In a change
//           you can change any index of the string to any character. A palindrome is a string that remains the
//           same if reversed.
// input 1:  abc
// output 1: 1
// input 2:  abcdef
// output 2: 3
import java.util.*;
public class Min_Changes_Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int len = str.length();
        int count = 0;
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) == str.charAt(len-1-i))
            count++;
        }
        System.out.println((len/2)-count);
    }
}
