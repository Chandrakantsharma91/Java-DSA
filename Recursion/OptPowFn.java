package Recursion;

public class OptPowFn {
    public static int Pow(int x , int n){
         int halfPowSq;
        if (n == 0) {
            return 1;
        }
        
         int halfPow = Pow(x, n/2);

        if (n%2 == 0) {
            halfPowSq = halfPow * halfPow;
        }else{
            halfPowSq = x * halfPow * halfPow; 
        }
        return halfPowSq;

    }
    public static void main(String[] args) {
        int n = 10 ;
        int x = 2 ;
        System.err.println(Pow(x, n));
    }
}
