package Recursion;

public class FriendsPair {
    public static int pair(int n){
        // basecase
         if (n == 1 || n == 2) {
            return n;
         }

        //  single
        int fnm1 = pair(n-1);

        // pair
        int fnm2 = pair(n-2);
        int pairWays = (n-1)*fnm2;
        // total

        int total = fnm1+pairWays;
        return total;
    }
    public static void main(String[] args) {
        int n =3 ;
        System.out.println(pair(n));
    }
}
