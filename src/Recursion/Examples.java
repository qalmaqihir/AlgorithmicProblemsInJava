package Recursion;

public class Examples {

    public static void main(String[] args) {
//        System.out.println(sumIlterative(40));
//        System.out.println(sumRecursive(40));
        System.out.println(tailRecursion(10));
        System.out.println(headRecursion(10));

//        System.out.println(factorial(10)); // May cause stack-overflow for larger ints
//        System.out.println(factorialAvoidSOF(10,1));
    }
    public static int sumIlterative(int n){
        int total=0;
        for (int i=0;i<=n;i++){
            total+=i;
        }
        return total;
    }

    public static int sumRecursive(int n){
        if(n==1) {
            return 1;
        }
        return n+ sumRecursive(n-1);
    }

    /**
     *
     * if the recursive call occurs at the end of the method -> tail recursion
     * similar to the loop, the method executes all the statements before jumping into the next recursive call...
     *
     */
    public static int tailRecursion(int i){
        System.out.println("Calling the headRecursion function with n: "+ i);
        if (i==1){
            System.out.println("Base case reached!, From tail recursion");
            return 1;
        }
        // We can do many things here, before the second call
        System.out.printf("The value of n: %d\n", i);
//        System.out.println("We can do anything before the next recursive call. Tail Recursion");
        return tailRecursion(i-1);
    }

    /**
     *
     * if the recursive call occurs at the beginning of a method, -> it is head recursion.
     * The method saves the state before jumping into the next recursive call...
     * Java did not support head recursion
     */
    public static int headRecursion(int i){
        System.out.println("Calling the headRecursion function with n: "+ i);
        if (i==1){
            System.out.println("Base case reached! From Head Recursion");
            return 1;
        }
        headRecursion(i-1);
//        System.out.println("Call method recursively and then add our other code. Our variables are saved. Head Recursion");
        System.out.printf("The value of n: %d\n", i);
        return 0;
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n* factorial(n-1);

    }

    public static int factorialAvoidSOF(int ... args){
        int n = args[0];
        int result = args[1];
        if (n==1){
            return result;
        }
        return factorialAvoidSOF(n-1,n*result);
    }

}
