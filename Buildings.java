
// Question: There are N buildings in a row with different heights H[i] (1 <= i <= N). You are viewing the buildings
//           from the left and you can see the roof of a building i if no building to the left of the 'i'th building
//           has a height greater than the 'i'th building.
//           You are asked to find the number of buildings whose roofs you can see.
//           The first line contains N denoting number of buildings.
//           The next line contains N space seperated integers denoting heights of the buildings from left to right.
// Input:    N = 5, arr[] = {1,2,2,4,3}
// Output:   3
// Input:    N = 5, arr[] = {1,2,3,4,5}
// Output:   5

import java.util.*;
public class Buildings {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();
        int [] arr = new int [N];
        for (int a = 0; a < arr.length-1; a++) {
            arr[a] = input.nextInt();
        }
        System.out.println(visibleBuildings(arr,N));
    }

    public static int visibleBuildings (int [] arr, int N) {
        int count = 0;
        int min = 0;
         for (int i = 0; i < arr.length-1; i++) {
             if (arr[i] > min) {
                 min = arr[i];
                 count++;
             }
         }
         return count;
    }
}
