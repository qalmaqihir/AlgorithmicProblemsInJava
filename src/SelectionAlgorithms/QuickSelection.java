package SelectionAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSelection {
    private int[] nums;
    public QuickSelection(int[] nums){
        this.nums=nums;

    }
    public int select(int k){
        return quickSelect(0,nums.length-1,k-1);
    }

    /*
    sorting method implemented here
     */
    public void sort(){
        for (int i =1; i<nums.length+1;++i){
            select(i);
            System.out.println(select(i));
        }
    }

    // PARITION PHASE
    private  int partition(int firstIndex, int lastIndex){
        int pivot = new Random().nextInt(lastIndex-firstIndex+1)+ firstIndex;
        swap(pivot, lastIndex);
        for(int i= firstIndex; i<lastIndex;++i){
//            if(nums[i]<nums[lastIndex]){
//                swap(i,firstIndex);
//                firstIndex++;
//            }
            /**
             *For getting the kth greatest int
             */

            if(nums[i]>nums[lastIndex]){
                swap(i,firstIndex);
                firstIndex++;
            }
        }
        swap(lastIndex,firstIndex);
        return firstIndex;
    }
    private void swap(int pivot, int lastIndex){
        int temp = nums[pivot];
        nums[pivot]=nums[lastIndex];
        nums[lastIndex]=temp;
    }

    // SELECTION PHASE
    public int quickSelect(int firstIndex, int lastIndex, int k){
        int pivot_index= partition(firstIndex, lastIndex);
        if (pivot_index<k){
            return quickSelect(pivot_index+1,lastIndex,k);
        }else if (pivot_index>k){
            return quickSelect(firstIndex,pivot_index-1,k);
        }
        return nums[pivot_index];
    }
}
