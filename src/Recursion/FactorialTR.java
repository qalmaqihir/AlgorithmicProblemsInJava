package Recursion;

public class FactorialTR {

    public static void main(String[] args) {
        System.out.println(factorialTailRecursion(10,1));
    }

    public static int factorialTailRecursion(int n, int accumulator){
        if (n==1){
            return accumulator;
        }
        accumulator *= n;
        // Sub results are stored in the same function call, no need to keep track of all the variables and function calls in the stack like for head recursion

        return factorialTailRecursion(n-1,accumulator);
    }
}
