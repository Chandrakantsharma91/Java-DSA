package Array.ArrQuestions;

// Binary search is always used in Sorted array

// Time complexity = O(logn)

//  O(n) > O(logn)

public class BinarySearch {
    public static int sort(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start+end)/2;
            
            // compare
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid+1; // right

            }else{
                // left
                end = mid-1;
            }
        }
      return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4 , 6 ,8 , 10 , 12};
        int key = 10; 
        System.out.println(sort(arr, key));
    }
}
