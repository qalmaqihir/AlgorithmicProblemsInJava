package Recursion;

public class headRecursion {
    public static void main(String[] args) {
        System.out.println(headRecursion(10));

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
}
