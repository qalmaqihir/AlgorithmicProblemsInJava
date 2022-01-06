package Extras;

public class integerReversed {
    public static void main(String[] args) {
        System.out.println(reversedInteger(128440));
    }
    public static int reversedInteger(int n){
        int reversed=0;
        int remainder;
        while(n>0){
            remainder=n%10;
            reversed=reversed*10+remainder;
            n=n/10;
        }
        return reversed;
    }

}
