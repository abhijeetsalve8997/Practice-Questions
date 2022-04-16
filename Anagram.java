import java.util.*;
import java.util.Arrays;
public class Anagram {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner (System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();

        if (first.length() != second.length()) {
            System.out.print("NO");
        }
        else {
            char []arr1 = first.toCharArray();
            char []arr2 = second.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2) == true) {
                System.out.print("YES");
            }
            else {
                System.out.print("NO");
            }
        }
    }
}
