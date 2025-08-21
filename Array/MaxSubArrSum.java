package Array;

// Kadans algorithum say that make the negative number to  0 

// For all the negative number it does not give the right ans so add a special case for all the negative number

public class MaxSubArrSum {
    public static void Kadans(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for(int i = 0; i< arr.length ; i++){
            CurrentSum = CurrentSum + arr[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }

            MaxSum = Math.max(MaxSum, i);
        }
        System.out.println("our max Subarray sum is " + MaxSum);
    }
    
    public static void main(String[] args) {
        int arr[] = { - 2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        Kadans(arr);
    }
}
