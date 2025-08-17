package Dp;

public class ClimbStairs {
    // it is also a version of fibo series
     public static int Stairs(int n){
        // if(n ==1 ) return 1;
        // if (n == 0) return 1;
        // if (n < 0 ) return 0;
        
        int dp[] = new int [n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i<=n ; i++){
           dp[i] = dp[i-1] +  dp[i-2];

        } 
        return dp[n];
    }
    

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The series is " + Stairs(n));
    }
}
