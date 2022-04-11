import java.util.*;
// Question: Given a year, find if it is a leap year. Leap year is the year that is multiple of 4.
//           But, multiples of 100 which are not multiples of 400 are not leap years.
public class Leap_Year {
    public static void main (String [] args) {
        // 1st Approach: by using main method
        Scanner input = new Scanner (System.in);
        int year = input.nextInt();

        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }


        // call for function
        System.out.println(isLeapYear(2000));
    }

    // 2nd Approach: by using function
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            return true;
        }
        else
            return false;
    }
}
