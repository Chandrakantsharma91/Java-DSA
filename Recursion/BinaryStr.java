package Recursion;

public class BinaryStr {
    public static void Print(int n , int lastplace , String str){
        // /Base Case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaam
        Print(n-1, 0, str+"0");
        if (lastplace == 0) {
            Print(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        Print(3, 0, "");
        
    }
}
