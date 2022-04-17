// Question: Groot wants to send a message to Rocket. To make his message look interesting he thought he would
//           compress his message. He decides to do so by replacing consecutive duplicate occurrences with the
//           count of repetitions. Help Groot by writing a program to automatically convert his message.
//           We are given a string. Your task is to compress the consecutive letters of the string
//           For example: given string is "AAACCCBBD", thus here
//           A's occurrence 3 times
//           C's occurrence 3 times
//           B's occurrence 2 times
//           D's occurrence 1 time
//           So after compressing string becomes "A3C3B2D1".
import java.util.*;
public class Compress_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String str = sc.next();
            int len = str.length();
            for (int i = 0; i < len; i++) {
                int count = 1;
                int j = i+1;
                while (j < len && str.charAt(j) == str.charAt(i)) {
                    count++;
                    i = j;
                    j++;
                }
                System.out.print(str.charAt(i)+""+count);
            }
            test--;
            System.out.println();
        }
    }
}
