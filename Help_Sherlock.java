
// Question: Sherlock is a great detective but he is weak in maths. On one day Sherlock wants to divide N apples into
//           M people but he is not sure whether he can divide them equally or not. Your task is to help Sherlock
//           to solve the problem. (If apples are equally divided then return 1 else return 0)
// Input: N = 6, M = 2
// Output: 1
// Input: N = 4, M = 3
// Output: 0

public class Help_Sherlock {
    public static void main (String [] args) {
        System.out.println(helpSherlock(4,3));
    }
    public static int helpSherlock(int N, int M) {
        if (N % M == 0) {
            return 1;
        }
        else
            return 0;
    }
}
