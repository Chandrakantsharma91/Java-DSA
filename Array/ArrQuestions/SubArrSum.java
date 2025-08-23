package Array.ArrQuestions;

public class SubArrSum {
    public static void printSub(int arr[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i = 0; i< arr.length-1; i++){
            int start = i;
            for(int j = i; j<arr.length; j++){
                int end = j;
                currSum = 0;
                for(int k = start ; k <= end ; k++){
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if (MaxSum < currSum) {
                    MaxSum = currSum;
                }
              
            }
        
        }
        System.out.println("MaxSum " + MaxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 ,8 , 10};

        printSub(arr);
    }
}
