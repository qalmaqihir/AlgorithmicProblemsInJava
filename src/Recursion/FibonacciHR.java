package Recursion;

public class FibonacciHR {
    public static void main(String[] args) {
        System.out.println(fibonacciHeadRecursion(10));
    }
    public static int fibonacciHeadRecursion(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }

//        else{
//            return fibonacciHeadRecursion(n-1)+ fibonacciHeadRecursion(n-2);
//        }
        int fib1=fibonacciHeadRecursion(n-1);
        int fib2=fibonacciHeadRecursion(n-2);
        int result = fib1+fib2;
        return result;
    }

}
