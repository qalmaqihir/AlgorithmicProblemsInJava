public class FibonacciTR {
    public static void main(String[] args) {
//        System.out.println(fibonacciTailRecursion(8, 7, 6));
        System.out.println(fibonacciTailRecursion(10, 1, 1));
    }

    public static int fibonacciTailRecursion(int n, int fibo1, int fibo2) {
        if (n == 1) {
            return fibo1;
        }
        if (n == 0) {
            return fibo2;
        } else {
            int resn_1 = n + fibo1;
            int resn_2 = resn_1 + fibo2;
            return fibonacciTailRecursion(n - 1, resn_1, resn_2);
        }

//        /**
//         * Actual solution
//         *
//         */
//        if (n==1){
//            return fibo1;
//        }
//        if(n==0){
//            return fibo2;
//        }
//        return fibonacciTailRecursion(n-1, fibo2,fibo1+fibo2);
    }

}