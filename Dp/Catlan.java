package Dp;

// Using Recursion
public class Catlan {
    public static int Cat(int n){
        if (n == 0 || n == 1) return 1;

        int ans=0;
        for(int i =0 ; i<=n-1; i++){
            ans += (Cat(i)*Cat(n-i-1));
        }
        return ans;
    }

    public static int catTab(int n){
        int dp[] = new int[n+1];
        dp[0] =1;
        dp[1] =1;

        for(int i=2; i<=n; i++){
            for(int j=0; j<i; j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n =4;
        // System.out.println(Cat(n));
        System.out.println(catTab(n));
    }
}
