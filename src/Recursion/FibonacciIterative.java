package Recursion;

import java.util.Arrays;

public class FibonacciIterative {
    public static void main(String[] args) {
        System.out.println(fibonacciIterative(11));
    }
    public static int[] fibonacciIterative(int n){

        /**
         * A more clear solution
         */
        int a =0,b=1;
        while(a<n){
            System.out.println(a);
            int temp=b;
            b=a+b;
            a=temp;
        }


        int[] result = new int[n+1];
        result[0]=0;
        result[1]=1;
        result[2]=1;
        int i=3;
        while (n>=3){
            result[i] = result[i-1]+result[i-2];
            i++;
            n--;
        }


        System.out.println(Arrays.toString(result));
        return result;
    }
}
