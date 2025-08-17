package Backtracking;

public class Subset {
    public static void findSubset(String str , String ans , int i){
        // Base Case
       if (i == str.length()) {
        if (ans.length() == 0) {
            System.out.println("null");
        }else{
            System.out.println(ans);
        }
        return;
       }
 
        // Yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        // No choice
        findSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}
