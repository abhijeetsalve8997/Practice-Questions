import java.util.Arrays;
import java.util.Scanner;
public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        char [] arr = str.toCharArray();
        char [] rev = new char [arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            rev[k] = arr[i];
            k++;
        }
        boolean flag = Arrays.equals(arr,rev);
        if (flag == true) {
            System.out.println("Given String is palindrom");
        }
        else {
            System.out.println("Given string is not palindrom");
        }
    }
}
