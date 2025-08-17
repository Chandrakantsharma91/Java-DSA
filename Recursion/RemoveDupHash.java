package Recursion;

import java.util.*;

public class RemoveDupHash {
    public static String removeDub(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            char c = str.charAt(i);

            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "appnaacollege";
        String ans = removeDub(str);
        System.out.println(ans);
    }
}
