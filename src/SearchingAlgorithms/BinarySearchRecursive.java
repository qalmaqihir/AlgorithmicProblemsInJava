package SearchingAlgorithms;

import java.util.Arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        int[] arr=new int[20];
        for(int i=-10; i<20;i++){
            arr[Math.abs(i)]=i-10;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchR(arr,9, 0,arr.length-1));
    }
    public static int binarySearchR(int[] given, int target, int start, int end){
//        System.out.println(start+ " Starting point \n"+ end+" ending point");
        int middle = (start+end)/2;
        if (given[middle]==target){
            return middle;
        }
        if(start>end){
            return -1;
        }

        else if (given[middle]<target){
//            System.out.println("Target is in: ");
//            System.out.println(Arrays.toString(Arrays.copyOfRange(given,middle+1,end)));
            return binarySearchR(given,target,middle+1,end);
        }
        else if (given[middle]>target){
//            System.out.println("Target is in: ");
//            System.out.println(Arrays.toString(Arrays.copyOfRange(given,start,middle)));
            return binarySearchR(given,target,start,middle-1);
        }
        return -1;
    }
}
