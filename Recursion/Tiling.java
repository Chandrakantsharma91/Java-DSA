package Recursion;

public class Tiling {
    public static int TilingProblem(int n){ // tile size = 2 x n
        // baseCase
        if (n == 0 || n ==1) {
            return 1;
        }
        
        // kaam
        // choice -> Vertical
        int fnm1 = TilingProblem(n-1);

        //choice -> Hoizontal
        int fnm2 = TilingProblem(n-2);

        int total = fnm1+fnm2;
        return total;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(TilingProblem(n));
    }
}
