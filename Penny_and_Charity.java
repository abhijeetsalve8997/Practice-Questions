
// Question: There is a charity which has N people. Penny wants to donate some of her clothes to the charity in such
//           a way that all people receive equal clothes and each individual receives more than 1. If she has
//           M clothes with her what is the maximum number of clothes one individual can get? (If the above condition
//           is true then return maximum number of cloths gets an individual otherwise return -1)
// Input:    N = 6, M = 20
// Output:   3
// Input:    N = 8, M = 5
// Output:   -1

public class Penny_and_Charity {
    public static void main (String [] args) {
        System.out.println(donateCloths(8,16));
    }
    public static int donateCloths (int N, int M) {
        int ans = M / N;
        if ( ans > 1 ) {
            return ans;
        }
        else
            return -1;
    }
}
