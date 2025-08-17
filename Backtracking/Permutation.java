package Backtracking;

public class Permutation {
    public static void permutation(String str , String ans){
        // Base Case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" using substrig method
            String  newstr = str.substring(0, i) + str.substring(i+1); 
            permutation(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}
