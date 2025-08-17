package Backtracking;

public class GridWays {
    public static int findways(int i , int j , int n , int m){
        // Tc = O(2^n+m) which is not good so we use permution formula in this to minimize the time complexity to O(n)
        // Basecase
        if (i == n-1 && j == m-1) {
            return 1;
        }else if (i == n || j == m) {
            return 0;
        }

        // recurrence  relation 
        int w1 = findways(i+1, j, n, m);
        int w2 = findways(i, j+1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3 ; int m = 3;
        System.out.println(findways(0, 0, n, m));
    }
}