// Question: Given a string S, check if the given string contains any white space or not.
// Input1  : newton school
// Output1 : YES
// Input2  : newtonschool
// Output2 : NO
import java.util.*;
public class Check_WhiteSpaces {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner (System.in);
        String word = input.nextLine();
        char []arr = word.toCharArray();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                flag = true;
                System.out.print("Yes");
            }
        }
        if(flag == false) {
            System.out.print("No");
        }
    }
}
