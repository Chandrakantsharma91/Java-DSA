package Dp;

public class Fibonacci {
    public static int fibo(int n){
        // if (n == 0) return 0;      It takes exponential time complexity that's why we use dp approach
        // if ( n== 1) return 1;        
        // return  fibo(n-1) + fibo(n-2);


        // Dp  TC -> 0(N) linear time complexity
        int dp [] = new int[n+1];
        dp[0] = 0;
        dp[1] =1;
        for(int i=2 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
   public static void main(String[] args) {
    int n =5;
    System.out.println("Thre series is " + fibo(n));
   }

}
