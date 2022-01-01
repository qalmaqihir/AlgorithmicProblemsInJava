package SearchingAlgorithms;

import java.util.Arrays;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arr=new int[20];
        for(int i=0; i<arr.length;i++){
            arr[Math.abs(i)]=-i+10;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearchI(arr,-18));

    }

    public static int binarySearchI(int[] given, int target){
        int start =0;
        int end=given.length;
        int foundIndedx=-1;
        while (start<end){
            int middle=(start+end)/2;
            if(given[middle]==target){
                foundIndedx=middle;
                break;
            }
            else if (given[middle]<target){
                end=middle;
            }
            else if (given[middle]>target){
                start=middle+1;
            }
        }
        return foundIndedx;

    }
}
