package Recursion;

public class Factorial {
    public static int  Fact(int  n){
        if (n == 0 )  return 1;
        int PrintFact  = n*Fact(n-1);
        return PrintFact;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n));
    }
}
