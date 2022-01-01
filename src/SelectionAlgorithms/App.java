package SelectionAlgorithms;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {1,-5,10,2,3,-7,7,11,100};
        QuickSelection q = new QuickSelection(nums);
        System.out.println(q.select(1));
        System.out.println(sorted(nums));
        q.sort();
    }

    public static int[] sorted(int[] arr){
                /*
        sorting in descending order using quick selection
         */
        int[] sortedNums = new int[arr.length];
        QuickSelection q = new QuickSelection(arr);
        for (int i =0; i< arr.length;++i){
            sortedNums[i]= q.select(i+1);
        }
        System.out.println(Arrays.toString(sortedNums));
        return sortedNums;
    }

}
