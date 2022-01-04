package DynamicProgramming.FibonacciNumber;

import java.util.HashMap;
import java.util.Map;

public class FinonaaciNumbers {
    public static void main(String[] args) {

        Map<Integer,Integer> table = new HashMap<>();
        table.put(0,1);
        table.put(1,1);
        // It has exponential running time complexty
//        System.out.println(fibonacciRecursion(50));

        // they have linear running time Complexity
//        System.out.println(fibonacciDPTabulation(50,table));
//        System.out.println(fibonacciDPMemorization(50,table));


    }
    public static int fibonacciRecursion(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    //// TOP-DOWN approach - Memorization
    public static int fibonacciDPMemorization(int n, Map<Integer, Integer> table){
        // TOP-DOWN approach
        if (!table.containsKey(n)){
            table.put(n, fibonacciDPMemorization(n-1, table)+fibonacciDPMemorization(n-2,table));
        }
        // O(1) running time
        return table.get(n);

    }
    //// TOP-DOWN approach - Tabulation
    public static int fibonacciDPTabulation(int n, Map<Integer,Integer> table1){
        for (int i = 2; i <=n ; i++) {
            table1.put(i, table1.get(i-1)+table1.get(i-2));
        }
        // O(N) linear running time complexity
        return table1.get(n);
    }
}
