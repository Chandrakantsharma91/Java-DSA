package Recursion;

public class OptimizeTiling {
    public static int Tiling(int n){
        int dp[] = new int[n+1];

        // initilization
        dp[0] = 1;
        dp[1] = 1;

        // Tabulation
        for(int i =2 ; i<=n; i++ ){
            dp[i] = dp[i-1]+ dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Tiling(n));
    }
}
