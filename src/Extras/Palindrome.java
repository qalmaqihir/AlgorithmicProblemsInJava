package Extras;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome1("sakdjflasdjf"));
//        System.out.println(isPalindrome1("abbaa"));

        System.out.println(isPalindrome2("sakdjflasdjf"));
        System.out.println(isPalindrome2("abcba"));
    }

    public static boolean isPalindrome1(String s){
        String reveresed="";
        for (int i = 0; i < s.length(); i++) {
            reveresed=reveresed+s.charAt(s.length()-1-i);

        }
        if (s.equals(reveresed)){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome2(String s){
        int start=0;
        int end=s.length()-1;
        int middle=(start+end)/2;
        while(start<=middle){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }

        return true;

    }
}
