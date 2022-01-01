package Recursion;

public class tailRecursion {
    public static void main(String[] args) {
        System.out.println(tailRecursion(10));
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

}
