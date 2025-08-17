package Dp;

public class TargetSum {
    public static boolean TargetSumTab(int numbers[] , int targetSum ){
        int n = numbers.length;
        boolean dp[][] = new boolean[n+1][targetSum+1];
        for(int i = 0; i< dp.length ; i++) { // column true
            // i -> item , j -> targetsum
            dp[i][0] = true;
        }
        for( int i = 1 ; i<n+1; i++){
            for( int j = 1; j <targetSum+1 ; j++){
                int v = numbers[i-1];
                // include
                     if(v <= j && dp[i-1][j-v] == true){
                        dp[i][j] = true;
                     }
                // exclude
                else if (dp[i-1][j] == true) {
                        dp[i][j] = true;
                    
                }
            }
        }
        return dp[n][targetSum];
    }
    public static void main(String[] args) {
        int numbers[] ={ 4 , 2 , 7 , 1 , 3};
        int targetSum  = 10 ;
        System.out.println(TargetSumTab(numbers, targetSum));
    }
}
