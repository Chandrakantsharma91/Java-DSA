package Array.SortingTechniques;

public class QuickSort {
    public static void Sort(int arr[] , int si , int ei){
        if (si >= ei) {
            return;
        }
        // last element
        int pidx = partition(arr , si , ei);
        Sort(arr, si, pidx-1); // left 
        Sort(arr, pidx+1, ei); // right
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j= si; j<ei; j++){
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
          i++;
          // swap
          int temp = pivot;
          arr[ei] = arr[i];
          arr[i] = temp;
          return i;
    }
    // step1 -> select a pivot
    // step2 -> partision
    // step3 -> QuickSort(left)
    //          QuickSort(right)

    public static void main(String[] args) {
         int arr[] = {6,3,9,5,2,8,-2};
         Sort(arr , 0 , arr.length-1);

         for(int i=0; i<arr.length-1; i++){
             System.out.print(arr[i] + " ");
         }
         System.out.println();
    }
}
