package SearchingAlgorithms;

import java.util.Arrays;

public class LinearSearchRecursive {
    public static void main(String[] args) {
        int[] arr={23,4,5,-2,3,0,8,21};
        System.out.println(find(arr,-18,0));
        System.out.println(find(arr,8,0));
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr,2,arr.length)));

    }
    public static int find(int[] given, int target,int index){
        // search miss
        if(index>= given.length){
            return -1;
        }
        // base case
        if(given[index]==target){
            return index;
        }
        return find(given,target,index+1);
    }
}
