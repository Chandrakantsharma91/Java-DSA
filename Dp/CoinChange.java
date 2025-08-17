package Dp;

public class CoinChange {
    public static int CoinChangeTab(int coin[] , int sum){
        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0 ; i<n; i++){
            dp[i][0] = 1; // initilizing the colum value by 1
        }
        for(int j = 0; j< sum; j++){
            dp[0][j] = 0; // intilizing the row value by 0
        }

        // Tabullation code
        for(int i =1 ; i< n+1; i++){
            for(int j =1 ; j< sum+1; j++){
                if (coin[i-1] <= j) { //valid
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                }else{
                    // invalid
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    
    public static void main(String[] args) {
        int coin[] = {1 , 2 , 3};
        int sum = 4;
        System.out.println(CoinChangeTab(coin, sum));
    }
}
