// Question: A conveyor belt has parcels that must be shipped from one point to another within D days.
//           The i-th parcel on the conveyor belt has a weight of weights[i]. Each day, we load the ship with parcels on the conveyor belt
//           (in the order given). We may not load more weight than the maximum weight capacity of the ship. Return the least weight capacity of the ship
//           that will result in all the parcels on the conveyor belt being shipped within D days.
//           Note:- the cargo must be shipped in the order given
// Input:    Parcels = 10, Days = 5, arr [] = {1,2,3,4,5,6,7,8,9,10}
// Output:   15 (maximum capacity for given days)
// Input:    Parcels = 6, Days = 3, arr [] = {3,2,2,4,1,4}
// Output:   6 (maximum capacity for given days)

import java.util.*;
public class Shipping_Parcels {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tests = input.nextInt();
        while (tests > 0) {
            int parcels = input.nextInt();
            int days = input.nextInt();
            int [] arr = new int [parcels];
            for (int a = 0; a < parcels; a++) {
                arr[a] = input.nextInt();
            }
            int low = 0;
            int high = 0;
            for (int b = 0; b < parcels; b++) {
                if (arr[b] > low) {
                    low = arr[b];
                }
                high += arr[b];
            }
            int capacity = 0;
            while (low <= high) {
                int mid = (low+high)/2;
                if (condition(arr, parcels, days, mid)) {
                    capacity = mid;
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            System.out.println(capacity);
            tests--;
        }
    }
    public static boolean condition (int []arr, int parcels, int days, int mid) {
        int sum = 0;
        int D = 1;
        for (int c = 0; c < parcels; c++) {
            if (sum+arr[c] <= mid) {
                sum += arr[c];
            }
            else {
                sum = arr[c];
                D++;
            }
        }
        if (D <= days) {
            return true;
        }
        return false;
    }
}
