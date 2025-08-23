package Array.SortingTechniques;

// Time Complexity = O(nlogn);
// Space Complexity = O(n)
// it is also known as Depth first technique

public class MergeSort {
    public static void Sort(int arr[] , int si , int ei){
        if (si >= ei) {
            return;
        }
        // step1 -> Divide
        int mid = si +(ei-si)/2;

        // step2 -> mergeSort(left)
        Sort(arr, si, mid);

        //  mergeSort(right)
        Sort(arr, mid+1, ei);
        
        // step3 -> merge sorted array
        merge(arr , si , mid , ei);
    }

    public static void merge(int arr[] , int si ,int mid ,  int ei ){
        int temp[] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k  = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] =arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++ ;
            }
             k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right 
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr
        for(k =0, i=si ; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        // using divide and conqure technique sort the array until that it become a single node

        int arr[] = {6,3,9,5,2,8,-2};
        Sort(arr, 0, arr.length-1 );

        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
