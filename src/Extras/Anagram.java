package Extras;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "restful";
        String s2="flus000ter";
        char[] ss=new char[s1.length()];
        char[] sss= new char[s2.length()];

        for (int i = 0; i <s1.length() ; i++) {
            ss[i]=s1.charAt(i);
        }

        for (int i = 0; i <s2.length() ; i++) {
            sss[i]=s2.charAt(i);
        }
        System.out.println(isAnagram(ss,sss));

    }

    public static boolean isAnagram(char[] s1, char[] s2){
        if (s1.length!=s2.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for (int i = 0; i < s1.length ; i++) {
            if (s1[i]!=s2[i]){
                return false;
            }
        }
        return true;

    }
}
