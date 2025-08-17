package Recursion;

public class Inc {
    public static void PrintInc(int n ){
        if(n == 10){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        PrintInc(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        PrintInc(n);
    }
}
