import java.util.*;


public class Cuboid_Perimeter {

    // 1st Approach = using main method
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();

        int perimeter = 4*(length+width+height);
        System.out.println(perimeter);


        // call for function
        System.out.println(perimeter(12,4,3));
    }

    // 2nd Approach: using function
    public static int perimeter(int l, int b, int h) {
        int ans = 4*(l+b+h);
        return ans;
    }
}
