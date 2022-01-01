package Recursion;

public class FactorialHR {
    public static void main(String[] args) {
        System.out.println(factorialHeadRecursion(10));
    }
    public static int factorialHeadRecursion(int n){
        //base case
        if (n==1){
            return 1;
        }

        // First call the method recursively
        int res1 = factorialHeadRecursion(n-1);
        // we do some operations
        int result = n*res1;
        return result;
    }
}
