package Array.ArrQuestions;

// Space complexity O(1) 
// Time complexity O(1)
public class ReverseArr {
    public static void Reverse(int arr[]){
        int first = 0;
        int last = arr.length-1;

        while (first < last) {
            // swap

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 4 ,5 , 6};
        Reverse(arr);

        for(int i = 0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
