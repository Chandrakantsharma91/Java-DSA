package Array;

public class Largest {
    public static int getLargest(int arr[]){
        int Largest = Integer.MIN_VALUE; // - Infinity

        for(int i = 0; i<arr.length ;i++){
            if (Largest < arr[i] ) { // for smallest reverse the condition
                Largest = arr[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 ,3 ,5 , 6};
        System.out.println("Largest value is " + getLargest(arr));
    }

    
}
