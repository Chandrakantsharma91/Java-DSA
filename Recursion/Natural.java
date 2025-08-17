package Recursion;

public class Natural {
    public static int PrintSum(int n ){
        if(n == 1) return 1;
        return n+PrintSum(n-1);
    }

    public static void main(String[] args) {
        int n =5;
        System.out.println(PrintSum(n));
    }
}