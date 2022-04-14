// Question: Toros went to the supermarket to buy K items. There were a total of N items. Each item had a
//           distinct price Pi. He is cost-effective, so he would buy the K cheapest item. But he knows that
//           the more cheaper an item is, the more is the chances that it can be defective. So he planned to
//           ignore 2 cheapest items and buy K from the remaining ones.
//           Find the total cost of all items that he would buy.
// Input:    The first line contains two integers N and K, denoting the total number of items in the supermarket
//           and the number of items Toros is going to buy. The second line contains N distinct integers Pi ,
//           denoting the prices of the items
// Input 1:  5 2
//           4 1 2 3 5
// Output 1: 7
// Input 2:  10 8
//           99 56 50 93 47 36 65 25 87 16
// Output 2: 533

import java.util.*;
public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int i = sc.nextInt();
        int [] arr = new int [size];
        for(int a = 0; a < size; a++) {
            arr[a] = sc.nextInt();
        }
//        Arrays.sort(arr);
        bubbleSort(arr,size);
        long sum = 0;
        for(int j = 2; j < i+2; j++) {
            sum = sum+arr[j];
        }
        System.out.println(sum);
    }
    public static int[] bubbleSort(int [] arr, int size) {
        for (int a = 0; a < size; a++) {
            for (int b = 0; b < size-1-a; b++) {
                if (arr[b] > arr[b+1]) {
                    int temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
        }
        return arr;
    }
}
