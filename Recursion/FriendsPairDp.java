package Recursion;

public class FriendsPairDp {
     public static int pair(int n) {
        // dp[i] = number of ways to pair up i friends
        int[] dp = new int[n + 1];

        // base cases
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;

        // fill table iteratively
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + (i-1) * dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(pair(n));  // Output: 4
    }
}
