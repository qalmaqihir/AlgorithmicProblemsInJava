package Extras;

import java.util.Arrays;

public class largestSubarraySum {
    public static void main(String[] args) {

        int[] nums = {12, -2, 3, -5, 4, 6, 77, 4};
        System.out.println(findLargestsubArraySum(nums));
    }

    public static int findLargestsubArraySum(int[] array) {
//        int[][] maxes = new int[2][array.length+1];
//        maxes[0][0] = array[0];
//        maxes[1][0] = array[0];
//        for (int i = 1; i < array.length-1; i++) {
//            maxes[0][i] = Math.max(array[i], maxes[0][i] + array[i+1]);
//            if (maxes[0][i] > maxes[1][i]) {
//                maxes[1][i] = maxes[0][i];
//            }
//        }
//        System.out.println(Arrays.toString(maxes));
//        return maxes[1][array.length];

        int max_global=array[0];
        int max_cuurent=array[0];

        for (int i = 1; i <array.length ; i++) {
            max_cuurent=Math.max(array[i],max_cuurent+array[i]);
            if(max_cuurent>max_global){
                max_global=max_cuurent;
            }
    }
        return max_global;
    }
}
